import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = inp.nextInt();

        //part of top
        for(int i = 1; i <= n; i++) {
            for(int j = 1 ; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for(int k = 1 ; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //part of bottom
        for(int i = 2; i <= n; i++) {
            for(int j = 1 ; j <= i - 1 ; j++) {
                System.out.print(" ");
            }
            for(int k = (2 * n) - 2; k >= (2*i) - 2 ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}