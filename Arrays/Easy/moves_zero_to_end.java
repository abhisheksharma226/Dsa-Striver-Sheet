package Arrays.Easy;

public class moves_zero_to_end {
    public static void moves_zero(int arr[]){
        int index = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index ++;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        for(int num: arr){
            System.out.print(num);
        }
        // return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,4,2,6,0,3,0};
        moves_zero(arr);
    }
}
