package Arrays.Easy;

public class max_consecutives_count {
    public static int ones_count(int arr[]){
        int maxCount = 0;
        int currentCount = 0;

        for(int i =0; i<arr.length; i++){
            if(arr[i] == 1){
                currentCount += 1;
                maxCount = Math.max(maxCount, currentCount);
            }else if(arr[i] == 0){
                currentCount = 0;
            }
        }
        return maxCount;
    }
    public static void main(String args[]){
        int arr[] = {1,1,0,0,1,1,1,1,1,0};
        System.out.print(ones_count(arr));
    }
}