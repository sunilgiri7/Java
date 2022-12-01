
class addition{
    public int func(int x, int y){
        return x+y;
    }
}
class abc{
    public static void main(String args[]) {
        addition add = new addition();
        int s = add.func(5,6);
        System.out.println(s);
    }
}