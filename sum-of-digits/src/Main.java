import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int entNum, temp, counter = 0, digit = 0, digitValue, total = 0;
        Scanner inp = new Scanner(System.in);

        System.out.println("Please enter a number");
        entNum = inp.nextInt();
        temp = entNum;
        while (temp != 0) {
            temp  /= 10;
            digit++;
        }

        temp = entNum;
        while (temp != 0) {
            digitValue = temp % 10;

            total += digitValue;
            temp /= 10;
            counter++;
            if(counter != digit)
                System.out.print(digitValue + " + ");
            else
                System.out.print(digitValue + " = ");
        }
        System.out.println(total);
    }
}