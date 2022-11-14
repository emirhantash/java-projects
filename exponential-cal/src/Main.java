import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int entNum1 = -1, entNum2 = -1, result = 1;
        Scanner inp = new Scanner(System.in);

        System.out.println("Exponential Notation: a^n => a*a*a*...*a (n times) ");

        while (entNum1 < 0) {
            System.out.println("Please enter a number for base (a)");
            entNum1 = inp.nextInt();
        }

        while (entNum2 < 0) {
            System.out.println("Please enter a number for power (n)");
            entNum2 = inp.nextInt();
        }

        for(int i = 0; i < entNum2; i++) {
            result *= entNum1;
        }

        System.out.println(entNum1 + "^" + entNum2 + ": " + result);
    }
}