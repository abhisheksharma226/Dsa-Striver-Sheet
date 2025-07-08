package Arrays.Easy;

import java.util.Arrays;

public class tow_sum {
    public static int[] two(int arr[], int target){
        for(int i =0; i<arr.length; i++){
            for(int j = i + 1; j <arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int target = 7;

        System.out.println(Arrays.toString(two(arr, target)));
    }
}
