import java.util.Scanner;

public class Main {
    static int exponent(int a, int b) {
        if(b == 0)
            return 1;
        else
            return a * exponent(a, b - 1);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int expo;
        System.out.println("Enter the base value:");
        int base = inp.nextInt();
        do {
            System.out.println("Enter the exponent:");
            expo = inp.nextInt();
        }while(expo < 0);
        System.out.println(exponent(base, expo));
    }
}