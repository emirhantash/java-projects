import java.util.Scanner;

public class Main {
    static int fibonacci(int n) {
        if(n == 0)
            return 0;
        else if(n == 1 || n == 2)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
    // 0 1 1 2 3 5 8 13 21 34 55 89...
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("Please enter the n:");
            n = inp.nextInt();
        }while(n < 0);
        System.out.println(fibonacci(n));
    }
}