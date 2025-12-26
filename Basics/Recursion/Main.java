// package Basics.Recursion;

import Basic_Maths.Palindrome;

class Solution {
    //Sum of Natual Number
    public int sumOfNaturalNumbers(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }

    //Factorial
    public int factorial(int n ){
        int fact = 1;
        for(int i = 1; i<=n ; i++){
            fact *= i;
        }
        return fact;
        
    }

    //Reverse a given array
    public int[] reverseArray(int arr[]){
        int n = arr.length;
        int[] ans = new int[n];

        for(int i = 0; i<n; i++){
            ans[i] = arr[n - 1 - i];
        }
        return ans;
    }


    //Palindrome check
    public boolean Palindrome(int i, String S){
        if(i >= S.length()/2) return true;

        if(S.charAt(i) != S.charAt(S.length()-i-1)) return false;

        return Palindrome(i+1, S);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sc = new Solution();

        // //Sum of Natural Number
        // int n = 15;
        // int result = sc.sumOfNaturalNumbers(n);
        // System.out.println("Sum of natural numbers from 1 to " + n + " is: " + result);


        // //factorial
        // int fact = 5;
        // int factorial = sc.factorial(fact);
        // System.out.print("factorial is : " + factorial);


        // //Reverse a given array
        // int arr[] = {1,2,3,4,5};
        // int[] reversArray = sc.reverseArray(arr);
        
        // for(int i = 0; i < reversArray.length; i++){
        //     System.out.print(reversArray[i] + " ");
        // }
        // System.out.println();


        //Palindrome
        String S = "MADAM";
        System.out.print(sc.Palindrome(0,S));
    }
}
