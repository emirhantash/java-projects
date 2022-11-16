import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("Please enter a number:");
            n = inp.nextInt();
        }while (n < 0);

        for(int i = 1; i <= n; i++) {
            for(int j = 1 ; j <= i - 1 ; j++) {
                System.out.print(" ");
            }
            for(int k = (2 * n) - 1; k >= (2*i) - 1 ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}