package Arrays.Easy;

public class rotate_array {
    public static void rotate(int arr[], int k){
        int n = arr.length; 
        k = k % n; //Normalize K

        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
        
    }

    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        rotate(arr, 2);

        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
