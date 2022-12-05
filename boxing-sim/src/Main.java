import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of first fighter: ");
        String f1Name = scan.next();
        System.out.println("Enter the weight of first fighter: ");
        int weight1 = scan.nextInt();
        System.out.println("Enter the name of second fighter: ");
        String f2Name = scan.next();
        System.out.println("Enter the weight of second fighter: ");
        int weight2 = scan.nextInt();
        Fighter f1 = new Fighter(f1Name , Randomise.randDamage() , Randomise.randHealth(), weight1, Randomise.randDodgeChance());
        Fighter f2 = new Fighter(f2Name , Randomise.randDamage() , Randomise.randHealth(), weight2, Randomise.randDodgeChance());
        Ring r = new Ring(f1,f2 , 80 , 100);
        r.run();
    }
}