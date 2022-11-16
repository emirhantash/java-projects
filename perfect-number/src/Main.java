import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, tot = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Enter a number:");
            a = inp.nextInt();
        }while (a < 0);

        for(int i = 1; i < a; i++) {
            if(a % i == 0)
                tot += i;
        }

        if(tot == a)
            System.out.println(a + " is the perfect number.");
        else
            System.out.println(a + " is not the perfect number.");
    }
}