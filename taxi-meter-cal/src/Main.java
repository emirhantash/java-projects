import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float KM, total;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers");
        KM = input.nextInt();
        total = 10.0f + KM*2.20f;
        if(total<20)
            total = 20;
        System.out.println("Total fee is: " + total);
    }
}