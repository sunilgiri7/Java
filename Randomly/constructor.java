public class constructor {
    int a, b;
    constructor(){
        a = 10;
        b = 20;
        System.out.println(a);
        System.out.println(b);
    }
}
class constructorss{
    public static void main(String[] args) {
            constructor Cons = new constructor();
            System.out.println(Cons.a);
            System.out.println(Cons.b);
    }
}