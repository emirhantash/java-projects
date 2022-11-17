import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, f1 = 0, f2 = 1, tot;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("Enter the number of elements");
            n = inp.nextInt();
        }while (n < 0);
        System.out.print(f1 + " " + f2);
        tot = f1 + f2;
        for(int i = 0; i < (n-2); i++) {
            System.out.print(" " + tot);
            f1 = f2;
            f2 = tot;
            tot = f1 + f2;
        }
    }
}