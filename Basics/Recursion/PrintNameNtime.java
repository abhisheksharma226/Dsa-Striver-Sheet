class solution{
    public void printName(String name, int count, int N) {
        if(count == N){
            return;
        }

        System.out.println(name);

        printName(name, count+1, N);
    }
}

public class PrintNameNtime{
    public static void main(String[] args) {
        solution sol = new solution();
        String name = "Abhishek";
        int N = 5;
        int count = 0;


        sol.printName(name, count, N);
    }
}