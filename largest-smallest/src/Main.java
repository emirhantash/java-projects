import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, entNum, smallest = 0, largest = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("How many numbers will you enter?");
            n =  inp.nextInt();
        }while(n < 0);

        for(int i = 0; i < n; i++) {
            if(i > 0){
                System.out.println((i+1) + ". ");
                entNum = inp.nextInt();
                if(entNum < smallest)
                    smallest = entNum;
                else if(entNum > largest)
                    largest = entNum;
            }
            else {
                System.out.println((i+1) + ". ");
                entNum = inp.nextInt();
                smallest = entNum;
                largest = entNum;
            }
        }
        System.out.println("Max value: " + largest);
        System.out.println("Min value: " + smallest);
    }
}