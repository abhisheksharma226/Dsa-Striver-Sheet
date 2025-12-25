class solution{
    public void printSol(int current){
        if(current < 1){
            return;
        }

        System.out.println(current);
        printSol(current - 1);
    }
}

public class Print1ToN {
    public static void main(String[] args) {
        solution sol = new solution();
        int num = 10;

        sol.printSol(num);
    }
}
