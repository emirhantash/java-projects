import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int entNum = -1, f4, f5, c4 = 0, c5 = 0;
        Scanner inp = new Scanner(System.in);

        while(entNum < 0) {
            System.out.println("Please enter a positive integer");
            entNum = inp.nextInt();
        }

        for(f4 = entNum; f4 % 4 == 0; f4 /= 4)
            c4++;

        for(f5 = entNum; f5 % 5 == 0; f5 /= 5)
            c5++;

        System.out.println(entNum + ": " + "4^" + c4 + " * 5^" + c5);
    }
}