class base{
    void main() {
        System.out.println("HEllo this is base class");
    }
}
    class derived extends base{
        void deriv(){
            System.out.println("This is derived class");
        }
}
class method{
    public static void main(String args[]) {
        base b1 = new base();
        derived d1 = new derived();
        b1.main();
        d1.deriv();
    }
}
