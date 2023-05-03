class main{
    public int func(int a){
        System.out.println("hello world");
        a = a+1;
        return a;
    }
}

public class class2 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        main m1 = new main();
        int n = m1.func(5);
        System.out.println(n);
    }
}
