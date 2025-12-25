// package Basics.Recursion;

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
}

public class Main {
    public static void main(String[] args) {
        Solution sc = new Solution();
        int n = 15;
        int result = sc.sumOfNaturalNumbers(n);
        System.out.println("Sum of natural numbers from 1 to " + n + " is: " + result);


        //factorial
        int fact = 5;
        int factorial = sc.factorial(fact);
        System.out.print("factorial is : " + factorial);
    }
}
