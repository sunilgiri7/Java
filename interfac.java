

class show{
    protected interface yes{
        void print();
    }
}
class showw implements show.yes{
    public void print(){
        System.out.println("This is derived class");
    }
}
class interfac{
    public static void main(String args[]) {
        show.yes s1;
        showw ss1=new showw();
        s1=ss1;
        s1.print();
    }
}
