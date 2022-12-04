package i;

import java.util.Scanner;

public class o_in_arr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int flag=1;
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] num = new int [rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                num[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entered Elements are:");
        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        
        
    }

    // Let we traverse the element
    System.out.println("Enter any element you want to track:");
    int x = sc.nextInt();
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            if(num[i][j]==x){
                System.out.println("Element found in ("+ i +","+ j +")");
                flag=0;
                break;
            }
            }
        }
        if(flag==1){
            System.out.println("Element is not present in array");
        }
    }
}
