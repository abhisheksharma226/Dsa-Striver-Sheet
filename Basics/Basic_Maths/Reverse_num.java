package Basic_Maths;

public class Reverse_num {
    public static void main(String[] args) {
        int num = 123456;
        int rev = 0;

        while ( num > 0){
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        System.out.print(rev);
    }
}
