import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int entNum1 = -1, entNum2 = -1, fac1 = 1, fac2 = 1, fac3 = 1;
        Scanner inp = new Scanner(System.in);

        System.out.println("C(n,r) = n!/(r!(n-r)!)  n choose r");

        while ( entNum1 < 0) {
            System.out.println("Please enter a number for n(objects)");
            entNum1 = inp.nextInt();
        }
        while ( entNum2 < 0) {
            System.out.println("Please enter a number for r(sample)");
            entNum2 = inp.nextInt();
        }

        if (entNum1 != 0 || entNum1 != 1) {
            for(int i = 2; i <= entNum1; i++)
                fac1 *= i;
        }

        if (entNum2 != 0 || entNum2 != 1) {
            for(int i = 2; i <= entNum2; i++)
                fac2 *= i;
        }

        for(int i = 2; i <= (entNum1 - entNum2); i++)
            fac3 *= i;

        System.out.print("C(" + entNum1 +", " + entNum2 + ") = ");
        System.out.print(entNum1 + "!/(" + entNum2 + "!(" + entNum1 + "-" + entNum2 + ")!) = ");
        System.out.println(fac1 / (fac2 * fac3));
    }
}