public class selection_sort {
    public static void print(int arr[]) {
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr [] = {8,5,3,6,8,5};
        // Time complexity = O(n^2)
        for (int i=0; i<arr.length-1; i++){
            int smallest = i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        print(arr);
    }
}
