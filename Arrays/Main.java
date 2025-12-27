package Arrays;

public class Main {
    //First Largest element in arrya
    public static int LargestElementInArray(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length; i ++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //Second largest element in arrya
    public static int SecondLargestElementInArray(int arr[]){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        // //Largest Element in Array
        // int arr[] = {6,386,3,9,1,66,3,0,1};
        // System.out.print(LargestElementInArray(arr));

        //second largest element in arrya
        int arr[] = {6,386,340,3,9,1,66,3,0,1};
        System.out.print(SecondLargestElementInArray(arr));
    }
}
