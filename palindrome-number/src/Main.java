import java.util.Scanner;

public class Main {
    static boolean isPalindrome(int num) {
        int temp = num, reverseNum  = 0, lastNumber;
        while(temp != 0) {
            lastNumber = temp % 10;
            reverseNum = (reverseNum * 10) + lastNumber;
            temp /= 10;
        }
        if(reverseNum == num) {
            System.out.println(num + " is palindrome");
            return true;
        }
        System.out.println(num + " is not palindrome");
        return false;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = inp.nextInt();
        isPalindrome(num);
    }
}