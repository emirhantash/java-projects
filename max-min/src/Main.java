import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {15,12,788,1,-1,-778,2,0};
        int number, min = array[0], max = array[0];

        System.out.println("Please enter a number");
        number = scan.nextInt();
        int[] newArray={15,12,788,1,-1,-778,2,0,number};
        Arrays.sort(newArray);
        min = newArray[Arrays.binarySearch(newArray,number)-1];
        max = newArray[Arrays.binarySearch(newArray,number)+1];

        System.out.println("largest number smaller than the number you entered = " + min);
        System.out.println("smallest number greater than the number you entered = " + max);
    }
}