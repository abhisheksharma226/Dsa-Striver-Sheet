public class left_rotate_array_by_one {
    public static void rotate_array(int arr[]){
        if (arr.length == 0) return;

       int first = arr[0];

        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length -1] = first;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        
        rotate_array(arr);
        
        printArray(arr);
    }
}
