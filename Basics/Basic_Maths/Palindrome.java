package Basic_Maths;

public class Palindrome {
    public static void main(String[] args) {
        int num = 45544;
        int originalNum = num;
        int rev = 0;

        while (num > 0) {
            int lastDigit = num % 10; // Get the last digit
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }

        if (rev == originalNum) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
