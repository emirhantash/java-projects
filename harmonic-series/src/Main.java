import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int entNum = -1;
        float total = 0f;
        Scanner inp = new Scanner(System.in);

        while(entNum < 0) {
            System.out.println("Please enter a positive integer:");
            entNum = inp.nextInt();
        }

        System.out.println("Number of " + entNum + " harmonic series is:");
        for(int i = 1; i <= entNum; i++) {
            if(i != entNum)
                System.out.print("(1/" + i + ") + ");
            else
                System.out.print("(1/" + i + ") = ");
        }

        for(int i = 1; i <= entNum; i++) {
            total += 1f/i;
        }
        System.out.println(total);
    }
}