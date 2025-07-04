public class second_largest {
    // public static int check(int arr[]) {
    //     int max = Integer.MIN_VALUE;
    //     int second = Integer.MIN_VALUE;

    //     for (int num : arr) {
    //         if (num > max) {
    //             second = max;
    //             max = num;
    //         } else if (num < max && num > second) {
    //             second = num;
    //         }
    //     }

    //     return second;
    // }

    
    //optimal way
    public static int check(int arr[]){
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;

        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }else if(arr[i] > largest && arr[i] < slargest){
                slargest = arr[i];
            }
        }
        return slargest;
    }


    public static void main(String[] args) {
        int arr[] = {1, 8, 3, 7, 2, 9, 4,12, 19, 7};
        System.out.println("Second largest: " + check(arr));  // 
    }
}
