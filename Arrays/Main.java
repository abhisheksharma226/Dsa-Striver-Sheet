package Arrays;

import java.util.Arrays;

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


    //Array is Sorted or NOt
    public static boolean SortedOrNot(int arr[]){
        for(int i = 1 ; i < arr.length; i++){
            if(arr[i] < arr[i-1]){ //If current element is small than previous one
                return false;
            }
        }
        return true;
    }


    //Remove duplicate from Array
    public static int RemoveDuplicateElement(int arr[]){
        Arrays.sort(arr);
        
        if(arr.length == 0) return 0;

        int i = 0;

        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }


    //Left Rotate the Array by One
    public static void LeftRotatetheArraybyOne(int arr[]){
        int temp = arr[0];

        for(int i = 1 ; i < arr.length; i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = temp;

    }



    //



    public static void main(String[] args) {
        // //Largest Element in Array
        // int arr[] = {6,386,3,9,1,66,3,0,1};
        // System.out.print(LargestElementInArray(arr));

        // //second largest element in arrya
        // int arr[] = {6,386,340,3,9,1,66,3,0,1};
        // System.out.print(SecondLargestElementInArray(arr));
    
    
        // //SOrted or Not
        // int arr[] = {1,2,3,4,5,6,9,0};
        // if(SortedOrNot(arr)){
        //     System.out.print("Yes");
        // }else{
        //     System.out.print("not");
        // }
    

        // //Remove duplicate from Array
        // int arr[] = {1,2,3,4,2,5,3};
        // int ans = RemoveDuplicateElement(arr);

        // for(int i = 0; i < ans; i ++){
        //     System.out.print(arr[i]);
        // }



        //Left Rotate the Array by One
        int arr[] = {1,2,3,4,5,6};
        LeftRotatetheArraybyOne(arr);

        for(int i = 0 ; i < arr.length; i ++){
            System.out.print(arr[i] + " ");
        }

    
    }
}
