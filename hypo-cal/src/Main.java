import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c1, c2;
        Scanner input  = new Scanner(System.in);
        System.out.println("Welcome to Hypotenuse Calculator");
        System.out.println("Enter the catheus one"); c1 = input.nextInt();
        System.out.println("Enter the other catheus"); c2 = input.nextInt();
        System.out.print("Hypotenuse equal to: " + Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2)));
    }
}