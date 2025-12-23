package Basic_Maths;

public class Count {
    public static void main(String[] args) {
        int n = 12498;
        int count = 0;

        while ( n > 0){
            n = n / 10; //It is for getting the last Number
            count ++;
        }

        System.out.print(count);
    }
}
