import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,op;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number");
        n1=input.nextInt();
        System.out.println("enter the second number");
        n2=input.nextInt();
        System.out.println("enter the operation\n1. addition\t2. extraction\t3. multiplication\t4. division");
        op=input.nextInt();
        switch (op) {
            case 1 -> {
                System.out.print("" + n1);
                System.out.print(" + ");
                System.out.print("" + n2);
                System.out.print(" = " + (n1 + n2));
            }
            case 2 -> {
                System.out.print("" + n1);
                System.out.print(" - ");
                System.out.print("" + n2);
                System.out.print(" = " + (n1 - n2));
            }
            case 3 -> {
                System.out.print("" + n1);
                System.out.print(" * ");
                System.out.print("" + n2);
                System.out.print(" = " + (n1 * n2));
            }
            case 4 -> {
                System.out.print("" + n1);
                System.out.print(" / ");
                System.out.print("" + n2);
                System.out.print(" = " + (n1 / n2));
            }
            default -> System.out.println("404");
        }
    }
}