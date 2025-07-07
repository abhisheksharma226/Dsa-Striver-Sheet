package Arrays.Easy;

public class remove_duplicate_from_sorted_array {
    public static int remove(int arr[]){
        if(arr.length == 0) return 0;

        int i = 0;

        for(int j = 1; j<arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 4};
        int k = remove(arr);

        System.out.println("k = " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
