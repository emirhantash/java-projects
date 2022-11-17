import java.util.Scanner;

public class Main {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        System.out.println("If you want to exit to adding number please enter 0");
        while (true) {
            System.out.print(i++ + ". number is :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number is :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;
        System.out.println("If you want to exit to adding number please enter 1");
        while (true) {
            System.out.print(i++ + ". number is :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void division() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number is :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter the divisor as 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base value :");
        int base = scan.nextInt();
        System.out.print("Enter the power value");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }

    static void mode() {
        Scanner scan = new Scanner(System.in);
        int a, b;
        do {
            System.out.println("Please enter the first number");
            a = scan.nextInt();
        }while(a < 1);
        do {
            System.out.println("Please enter the second number");
            b = scan.nextInt();
        }while(b < 1);

        System.out.println("Result : " + (a % b));
    }

    static void rectangularity() {
        Scanner scan = new Scanner(System.in);
        int opt, a, b;
        do {
            System.out.println("Please enter an option");
            System.out.println("1. Area calculation\n2. Perimeter Calculation");
            opt = scan.nextInt();
        }while(opt<1 || opt>2);
        do {
            System.out.println("Please enter the first edge of the rectangular");
            a = scan.nextInt();
        }while(a<0);
        do {
            System.out.println("Please enter the second edge of the rectangular");
            b = scan.nextInt();
        }while(b<0);

        if(opt == 1)
           System.out.println("Area of the rectangular: "+(a*b));
        else
            System.out.println("Perimeter of the rectangular: "+((2*a)+(2*b)));

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1. Collection Process\n"
                + "2. Subtraction Process\n"
                + "3. Multiplication Process\n"
                + "4. Division Process\n"
                + "5. Exponent Calculation\n"
                + "6. Factorial Calculation\n"
                + "7. Get Mode\n"
                + "8. Rectangular Area and Perimeter Calculation\n"
                + "0. Exit";

        do {
            System.out.println(menu);
            System.out.print("Please choose an option :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangularity();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid input. Try again!");
            }
        } while (select != 0);
    }
}