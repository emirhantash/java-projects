import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float height, weight;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in meter");
        height = input.nextFloat();
        System.out.println("Enter your weight in kilogram");
        weight = input.nextFloat();
        System.out.println("Your body mass index equal to: "+ weight/(height*height));
    }
}