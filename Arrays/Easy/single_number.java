package Arrays.Easy;
import java.util.Arrays;

public class single_number {
    public static int single(int arr[]){
        int result = 0;

        for(int num: arr){
            result ^= num;
        }
return result;
    }   

    public static void main(String[] args) {
        int arr[] = {1,7,1,7,3,8,3,9,8};
        System.out.println(single(arr));
    }
}
