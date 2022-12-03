package array_practice;

public class rev_str {
    public static void main(String[] args) {
        char [] arr = {'s','u','n','i','l'};
        int n = arr.length/2;
        char l =(char) arr.length;
        for(char i=0; i<=n; i++){
            char temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        System.out.println("Reversed String Is:");
        System.out.println(arr);
    }
}
