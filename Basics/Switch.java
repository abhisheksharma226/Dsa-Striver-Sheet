import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int day;

        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();

        switch(day){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            default:
                System.out.print("Invalid");
        }

        sc.close();
    }
}
