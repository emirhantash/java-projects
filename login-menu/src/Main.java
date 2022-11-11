import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        String userName, password, newPassword = "inp", yorn = "yorn";

        Scanner input = new Scanner(System.in);
        do {
        System.out.println("Please enter your username:");
        userName = input.nextLine();
        System.out.println("Data input is complete");

        System.out.println("Please enter your password:");
        password = input.nextLine();
        System.out.println("Data input is complete");

        if (userName.equals("emirhantash") && password.equals("emirhantash123"))
            System.out.println("Login Success");
        else {
            System.out.println("Login Failed");
            System.out.println("Would you like to reset your password? y/n");
            yorn = input.nextLine();
            System.out.println("Data input is complete");
            if (yorn.equals("y")) {
                do {
                    if (counter > 0) {
                        System.out.println("Error! The new password should not be the same as the old one");
                    } else {
                        System.out.println("Enter your new password");
                        newPassword = input.nextLine();
                        System.out.println("Data input is complete");
                    }
                    counter++;
                } while (newPassword.equals("emirhantash123"));
            }
        }
        } while (yorn.equals("n"));
    }
}