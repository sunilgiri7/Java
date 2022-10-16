import java.util.Scanner;
public class Array {
public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter 5 elements:"); 
        int a= sc.nextInt();
        int[] array = new int[5];
        for(int i=0; i<a; i++){
        array[i]=sc.nextInt();
        }
        System.out.println("Entered elements is:");
        for(int i=0; i<a; i++){
        System.out.println(array[i]);
        }
}}
