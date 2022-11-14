import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int entNum = 0,total = 0;
        Scanner inp = new Scanner(System.in);
        while (entNum % 2 == 0){
            System.out.println("Please enter a number");
            entNum = inp.nextInt();
            if(entNum % 4==0)
                total += entNum;
        }
        System.out.println("Total of entered (even and multiple of 4) numbers is: " + total);
    }
}