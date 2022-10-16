package C_Convert;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class main{
    public static void converter()
    {
        // Creating a new frame using Jframe
        JFrame f = new JFrame("CONVERTER");

        // Creating two labels
        JLabel l1, l2, l3, l4;

        // Creating Two fields
        JTextField t1, t2,t3;

        //Creating three buttons
        JButton b1, b2, b3,b4;

        // Naming the labels and setting 
        // The bounds for labels
        l1 = new JLabel("NPR:");
        l1.setBounds(30,40,60,30);
        l2 = new JLabel("Rupee:");
        l2.setBounds(190,40,80,30);

        // Initializing the text fields with
        // 0 by default and setting the
        //bounds for the text fields
        t1 = new JTextField("");
        t1.setBounds(80,40,50,30);
        t2 = new JTextField("");
        t2.setBounds(240,40,80,30);

        //creating a button for INR,
        //one button for the dollar
        //and one button to close
        //and setting the bounds
        b1 = new JButton("NPR");
        b1.setBounds(60,80,70,15);
        b3 = new JButton("Close");
        b3.setBounds(130,150,80,30);
        b2 = new JButton("INR");
        b2.setBounds(230,80,70,15);

        //adding action listener
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                //converting to double
                double d
                    = Double.parseDouble(t1.getText());

                    //converting rupeed to dollars
                    double d1= (d * 1.6);

                    //getting the string value of the 
                    //calculated value
                    String str1 = String.valueOf(d1);

                    //placing it in the text box
                    t2.setText(str1);
            }
        });

        //Adding action listner 
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                //converting to double
                double d2
                    = Double.parseDouble(t2.getText());

                    //converting dollar to rupees
                    double d3 = (d2 * 0.625);

                    //Getting the string value of the 
                    //calculated value 
                    String str2 = String.valueOf(d3);

                    //placing it in the text box
                    t1.setText(str2);
            }
        });

        //Action listner to close the form
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });

        //Default method to closing the frame 
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        //Adding the created object
        //to the form 
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        
        f.setLayout(null);
        f.setSize(400,300);
        f.setVisible(true);
    }
    //driver code
    public static void main(String args[])
    {
        converter();
    }
}
