import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);

        System.out.println("enter the temperature in centigrade: ");
        heat = inp.nextInt();

        if(heat <= 5)
            System.out.print("you can ski");
        else if(heat > 5 && heat <= 25) {
            System.out.print("you can go to cinema");
            if (heat >= 10)
                System.out.print(" or you can go to picnic");
        }
        else if(heat > 25)
            System.out.print("you can swim");
    }
}