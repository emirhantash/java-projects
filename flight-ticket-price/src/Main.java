import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter = 0, distanceInKM = 0, age = 0, type = 1; //type: one-way or round-trip
        Scanner inp = new Scanner(System.in);

        do {
            if (counter > 0)
                System.out.println("Invalid input");
            else {
                System.out.println("Please enter te distance");
                distanceInKM = inp.nextInt();
            }
            counter++;
        } while (distanceInKM < 0); counter = 0;

        do {
            if (counter > 0)
                System.out.println("Invalid input");
            else {
                System.out.println("Please enter your age");
                age = inp.nextInt();
            }
            counter++;
        } while (age < 0); counter = 0;

        do {
            if (counter > 0)
                System.out.println("Invalid input");
            else {
                System.out.println("Please enter the type of trip (1 => one-way     2 => round-trip");
                type = inp.nextInt();
            }
            counter++;
        } while (type < 1 || type > 2);

        if (age < 12) {
            if(type == 2)
                System.out.println("Total: " + distanceInKM*0.10*0.5*0.8*2 + "$");
            else
                System.out.println("Total: " + distanceInKM*0.10*0.5 + "$");
        }
        else if (age > 12 && age < 25) {
            if(type == 2)
                System.out.println("Total: " + distanceInKM*0.10*0.9*0.8*2 + "$");
            else
                System.out.println("Total: " + distanceInKM*0.10*0.9 + "$");
        }
        else if (age > 64) {
            if(type == 2)
                System.out.println("Total: " + distanceInKM*0.10*0.7*0.8*2 + "$");
            else
                System.out.println("Total: " + distanceInKM*0.10*0.7 + "$");
        }
        else {
            if(type == 2)
                System.out.println("Total: " + distanceInKM*0.10*0.8*2 + "$");
            else
                System.out.println("Total: " + distanceInKM*0.10 + "$");
        }
    }
}