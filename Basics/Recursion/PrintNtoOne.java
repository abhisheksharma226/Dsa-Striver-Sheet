class solution{
    public static void printN(int current, int N){
        if(current > N){
            return;
        }

        System.out.println(current);

        printN( current + 1, N);
    }
}
public class PrintNtoOne {
    public static void main(String[] args) {
        // solution sol = new solution();
        int n = 10;

        solution.printN(1, n);
    }
}
