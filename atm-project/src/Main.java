import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName1, userName2, password1, password2, yOrN = "n";
        int counter = 3, opt = 0;
        float balance = 0f, money;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sign In");

        System.out.println("Please enter your user name:");
        userName1 = inp.nextLine();

        System.out.println("Please enter your password:");
        password1 = inp.nextLine();

        System.out.println("Login");

        while (counter > 0) {
            System.out.println("Please enter your user name:");
            userName2 = inp.nextLine();

            System.out.println("Please enter your password:");
            password2 = inp.nextLine();

            if(!userName2.equals(userName1) || !password2.equals(password1)){
                System.out.println("Invalid username or password");
                counter--;
            }

            else {
                System.out.println("Login Successful");
                break;
            }
        }

        if(counter == 0)
            System.out.println("Your account has been blocked");

        System.out.println("Balance: " + balance);

        counter = 0;

        while(yOrN.equals("n")) {
            while(opt < 1 || opt > 3) {
                System.out.println("Transactions:\n1. Deposit      2. Withdraw      3. Transfer");
                opt = inp.nextInt();
                if(counter > 0)
                    System.out.println("Invalid options");
                counter++;
            }

            switch(opt) {
                case 1:
                    System.out.println("How much money will you deposit into your account?");
                    money = inp.nextFloat();
                    balance += money;
                    System.out.println("Balance: " + balance);
                    break;
                case 2:
                    System.out.println("How much money will you withdraw from your account?");
                    money = inp.nextFloat();
                    if(money > balance)
                        System.out.println("Error!");
                    else {
                        balance -= money;
                        System.out.println("Balance: " + balance);
                    }
                    break;
                case 3:
                    System.out.println("How much money will you transfer from your account?");
                    money = inp.nextFloat();
                    if(money > balance)
                        System.out.println("Error!");
                    else {
                        balance -= money;
                        System.out.println("Balance: " + balance);
                    }
                    break;
            }
            opt = 0;
            counter = 0;
            do {
                System.out.println("Do yo want to exit? (y/n)");
                yOrN = inp.next();
            }while (!yOrN.equals("n") && !yOrN.equals("y"));
        }
    }
}