import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float area, perimeter, r, PI = 3.14f;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter raidus of circle");
        r = input.nextFloat();
        area = PI*r*r;
        perimeter = 2*PI*r;
        System.out.println("Area of Circle: " + area);
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}