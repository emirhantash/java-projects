import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0, counter = 0, entNum;
        String yOrN = "y";
        Scanner inp = new Scanner(System.in);

        while(yOrN.equals("y")){
            System.out.println("Please enter a number: ");
            entNum = inp.nextInt();
            if(entNum % 3 == 0 && entNum % 4 == 0){
                total += entNum;
                counter++;
            }
            do {
                System.out.println("Do yo want to continue? (y/n)");
                yOrN = inp.next();
            }while (!yOrN.equals("n") && !yOrN.equals("y"));
        }
        System.out.println("Average of entered numbers is: " + total/counter);
    }
}