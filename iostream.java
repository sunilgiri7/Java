import java.util.Scanner;

public class iostream{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your Name");
        String Name = obj.nextLine();

        System.out.println("Enter your Name2");
        String Name2 = obj.nextLine();

        System.out.println("Enter your Name3");
        String Name3 = obj.nextLine();

        System.out.println("Enter your Name4");
        String Name4 = obj.nextLine();

        System.out.println("Here is your Names");
        System.out.println(Name);
        System.out.println(Name2);
        System.out.println(Name3);
        System.out.println(Name4);
    }
}
