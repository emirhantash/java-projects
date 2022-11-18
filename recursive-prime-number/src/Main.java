import java.util.Scanner;

public class Main {
    static boolean isPrime(int a,int i) {
        if(i == a)
            return true;
        else if(a % i == 0)
            return false;
        else
            return isPrime(a, i+1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        do {
            System.out.println("Please enter a positive integer");
            input = scan.nextInt();
        }while(input <= 0);
        if(isPrime(input, 2))
            System.out.println(input + " is prime number");
        else
            System.out.println(input + " is not prime number");
    }
}