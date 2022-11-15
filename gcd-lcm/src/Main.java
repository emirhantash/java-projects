import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter = 0, gcd = 0, lcm = 0, entNum1 = 0, entNum2 = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Enter the first number");
            entNum1 = inp.nextInt();
        }while(entNum1 < 0);

        do {
            System.out.println("Enter the second number");
            entNum2 = inp.nextInt();
        }while(entNum2 < 0);

        for(int i = 1; i <= entNum1 || i <= entNum2; i++){
            if(entNum1 % i == 0 && entNum2 % i == 0)
                gcd = i;
        }

        for(int i = 1; i <= entNum1 || i <= entNum2; i++){
            for(int j = 1; j <= entNum1 || j <= entNum2; j++){
                if(entNum1 * i == entNum2 * j) {
                    lcm = entNum1 * i;
                    counter++;
                    break;
                }
            }
            if(counter > 0)
                break;
        }

        System.out.println("GCD(" + entNum1 + ", " + entNum2 + ") = " + gcd);
        System.out.println("LCM(" + entNum1 + ", " + entNum2 + ") = " + lcm);
    }
}