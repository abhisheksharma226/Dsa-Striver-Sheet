import java.util.Scanner;

public class linear_search {

    public static int find(int arr[], int target) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;  // We found the first occurrence
            }
        }

        return index;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 8, 4, 32, 5};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the target: ");
        int target = scanner.nextInt();

        int result = find(arr, target);
        System.out.println("Index is: " + result);
    }
}
