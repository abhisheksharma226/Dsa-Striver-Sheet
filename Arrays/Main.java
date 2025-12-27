package Arrays;

public class Main {
    public static int LargestElementInArray(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length; i ++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }


   

    public static void main(String[] args) {
        //Largest Element in Array
        int arr[] = {6,386,3,9,1,66,3,0,1};
        System.out.print(LargestElementInArray(arr));
    }
}
