package Arrays.Easy;

import java.util.*;

public class union_of_two_sorted_array {
    public static List<Integer> union(int arr1[], int arr2[]){
        Set<Integer> set = new TreeSet<>();

        for(int num: arr1){
            set.add(num);
        }

        for(int num: arr2){
            set.add(num);
        }

        return new ArrayList<>(set);
        
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,7};

        List<Integer> result = union(arr1, arr2);
        System.out.println("Union of arrays: " + result);
    }
}
