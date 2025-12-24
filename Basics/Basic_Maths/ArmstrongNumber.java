package Basic_Maths;

public class ArmstrongNumber {
    public static boolean isArmStrong(int num){
        int n = num;
        int k = String.valueOf(n).length();
        int sum = 0;
        
        while(n > 0){
            int ld = n % 10; //get the last digit
            sum += Math.pow(ld,k); // power (ld^k)
            n /= 10; //remove digit
        }
        return sum == num;
    }
    public static void main(String[] args) {

        int number = 1534;
        if(isArmStrong(number)){
            System.out.print("Yes");
        }else{
            System.out.print("No");

        }
        
    }
}
