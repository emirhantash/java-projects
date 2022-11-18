import java.util.Scanner;

public class Main {
    static void pattern(int a, int count, boolean mid) {
        if(a <= 0)
            mid = true;
        System.out.print(a + " ");
        if(mid == false)
            pattern(a-5,count+1,mid);
        else {
            if (count == 0)
                return;
            else
                pattern(a+5,count-1,mid);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = scan.nextInt();
        pattern(input,0,false);
    }
}