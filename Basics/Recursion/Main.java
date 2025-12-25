// package Basics.Recursion;

class Solution {
    public int sumOfNaturalNumbers(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }

    
}

public class Main {
    public static void main(String[] args) {
        Solution sc = new Solution();
        int n = 15;
        int result = sc.sumOfNaturalNumbers(n);
        System.out.println("Sum of natural numbers from 1 to " + n + " is: " + result);
    }
}
