package Basic_Maths;

import java.util.ArrayList;
import java.util.List;

public class All_divisor {
    public static void main(String[] args) {
        int num = 10;
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);

                if (i != num / i) {
                    divisors.add(num / i);
                }
            }
        }

        System.out.print("Divisors of " + num + ": ");
        for (int val : divisors) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
