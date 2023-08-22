public class student{
    String name;
    int age;
    String address;

    public student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    public static void main(String[] args) {
        student john = new student("John", 22, "us-East-2");
        System.out.println(john.getName());
        System.out.println(john.getAge());
        System.out.println(john.getAddress());
    }
}