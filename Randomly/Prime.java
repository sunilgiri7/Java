import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n,m=0,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        n = sc.nextInt();
        m = n/2;
        for(int i=2; i<=m; i++){
            if(n%2==0){
                System.out.println("Not Prime");
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Is Prime");
        }
        sc.close();
    }
}
