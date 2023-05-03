import javax.lang.model.element.Element;

public class practice_1 {
    public static void main(String[] args) {

        //// Practice N0_1 ////
        /* Create an arry of 5 float and create their sum */

        /* float [] marks = {10.5f,11.5f,12.5f,13.5f,14.5f,15.5f};
        float s = 0;
        for (float elements:marks){
                s = elements + s;
        }
        System.out.println("Sum of float is:"+s);
    } */

        //// Practice No_2 ////
        /* WAP weather a given number is present in array or not */

        /*float [] marks = {10.5f,11.5f,12.5f,13.5f,14.5f,15.5f};
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
        } */

        //// Practice No_3 ////
        /* Calculate avg marks of array contain marks of all student in physics using for loop */

        /* float [] marks = {10.5f,11.5f,12.5f,13.5f,14.5f,15.5f};
        float sum=0;
        for(float elements:marks){
            sum = sum+elements;
        }
        System.out.println("Average of subject is:"+sum/marks.length);
} */

        //// Practice No_4 ////
        /* WAP to add two matrices of 2x3 */
        int [][] mat1 = {{2,3,4},
                          {5,6,7}};
        int [][] mat2 = {{2,3,4},
                         {5,6,7}};
        int [][] result = {{0,0,0},
                           {0,0,0}};
        for(int i=0; i<mat1.length; i++){ // Row number of times
            for(int j=0; j<=mat2.length; j++){ // Column number of times
                    System.out.format("metrix are i=%d j=%d\n",i,j); 
                    result[i][j]  = mat1[i][j] + mat2[i][j];  
            }
        }
        for(int i=0; i<mat1.length; i++){ // Row number of times
            for(int j=0; j<=mat2.length; j++){
                System.out.println(result[i][j] + " ");
                result[i][j]  = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
    }
}
}

        //// Practice No_5 ////
        /* WAP to reverse a string */

        /* int [] arr = {1,2,3,4,5};
        int l = arr.length;
        int temp,sum=0;
        int n = Math.floorDiv(arr.length, 2);
        for(int i=0; i<=n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;}
            for(int element:arr){
                System.out.println(element);
                sum = sum + element;
            }
            System.out.println(sum+" is the sum of reverse");
} */

            //// Practice No_6 ////
            /* WAP to find max element of array */

            /* int [] arr = {45,55,666,75,43,23};
            int max = 0;
            for(int e:arr){
                if(e>max){
                    max = e;
                }
            }
            System.out.println("Biggest number in array is:"+max);
} */

            //// Practice No_7 ////
            /* WAP to find min element of array */

            /* int [] arr = {2,34,121,323,5,23};
            int min = arr[0];
            for(int e:arr){
                if(e<min){
                    min = e;
                    }
            }
            System.out.println("Minimun in array is:"+min);
} */

            //// Practice No_8 ////
            /* WAP to find a array is sorted or not */

//             int [] arr = {1,2,3,4,5,8,7};
//             boolean isSorted=true;
//             for(int i=0; i<=arr.length-2; i++){
//                 if(arr[i] > arr[i+1]){
//                     isSorted = false;
//                     break;
//                 }
//             }if (isSorted){
//                 System.out.println("sorted");
//             }else{
//                 System.out.println("Not sorted");
//             }

// }


