package array_practice;

public class practice_1 {
    public static void main(String[] args) {
        /* float [] marks = {10.5f,11.5f,12.5f,13.5f,14.5f,15.5f};
        float s = 0;
        for (float elements:marks){
                s = elements + s;
        }
        System.out.println("Sum of float is:"+s);
    } */

        float [] marks = {10.5f,11.5f,12.5f,13.5f,14.5f,15.5f};
        float num = 12.5f;
        for (float elements:marks){
                if(elements==num){
                    float element = elements=num;
                    System.out.println("Num present in array"+element);
                    break;
                    
                }else{
                    System.out.println("Num not present in array");
                }
                }
        }
}
