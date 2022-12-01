class add{
    int x, y;
    void func(int a, int b){
        x=a;
        y=b;
    }
}
public class classObj1 {
    public static void main(String args[]) {
        add a1= new add();
        a1.func(5, 6);
        System.out.println(a1.x);
        System.out.println(a1.y);
    }
}
