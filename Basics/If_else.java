import java.util.Scanner;

public class If_else{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        if(age >= 18){
            System.out.print("You are Eligible");
        }else{
            System.out.print("You are Not Eligible");
            
        }

        sc.close();
    }
}