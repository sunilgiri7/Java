import java.util.Scanner;
public class functions {
    static int fact(int n){
        int s = 1;
        for(int i=n; i>=1; i--){
            s = s*i;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = fact(x);
        System.out.println("Factorial is:"+a);
        sc.close();
}
}
