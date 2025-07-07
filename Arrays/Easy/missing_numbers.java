package Arrays.Easy;

public class missing_numbers {
    public static int missing(int arr[]){
        int n = arr.length; 

        int total_sum = n * (n+1)/2;
        int actual_sum = 0;

        for(int i =0; i<arr.length; i++){
            actual_sum += arr[i];
        }
        return total_sum - actual_sum;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,2,4,6,3};

        System.out.print(missing(arr));
    }
}
