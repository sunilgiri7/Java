public class pattern{
    public static void main(String[] args) {
    pattern_7(4);
    }

    static void pattern_1(int n) {
    for(int rows=1; rows<=n; rows++){
        for(int cols=1; cols<=rows; cols++){
            System.out.print("* ");
        }
        System.out.println("");
    }
}

    static void pattern_2(int n) {
    for(int rows=1; rows<=n; rows++){
        for(int cols=1; cols<=n; cols++){
            System.out.print("* ");
        }
        System.out.println("");
    }
}


    static void pattern_3(int n) {
    for(int rows=1; rows<=n; rows++){
        for(int cols=1; cols<=n-rows+1; cols++){
            System.out.print("* ");
        }
        System.out.println("");
    }
}

    static void pattern_4(int n) {
    for(int rows=1; rows<=n; rows++){
        for(int cols=1; cols<=rows; cols++){
            System.out.print(cols);
        }
        System.out.println("");
    }
}

    static void pattern_5(int n) {
    for(int rows=0; rows<=2*n; rows++){
        int totalcolsinrow = rows>n ? 2*n-rows:rows;
    	        for(int cols=0; cols<=totalcolsinrow; cols++){
            System.out.print("* ");
	        }
	        System.out.println("");
	    }
	}

    static void pattern_6(int n) {
    //inner loop  
    for (int i= 0; i<= n; i++)  
    {  
    //outer loop  
    for (int j=1; j<=n-i; j++)  
    {  
    System.out.print(" ");  
    }  
    for (int k=0;k<=i;k++)  
    {  
    System.out.print("*");  
    }   
    System.out.println("");  
    }  
}

    static void pattern_7(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int k=i; k>=1; k--){
                System.out.print(k+" ");
            }
            for(int l=2; l<=i; l++){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
    

