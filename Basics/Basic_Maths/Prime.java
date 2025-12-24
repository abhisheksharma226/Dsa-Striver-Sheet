package Basic_Maths;

public class Prime {
    public static void main(String[] args) {
        int n = 4;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("yes prime");
        } else {
            System.out.println("not prime");
        }
    }
}
