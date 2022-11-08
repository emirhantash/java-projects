import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float withOutKDV, withKDV, KDV;
        Scanner input = new Scanner(System.in);

        do {
        System.out.println("enter the fee without KDV"); //KDV mean is Value-added tax
        withOutKDV = input.nextFloat();
        } while(withOutKDV<0);

        if(withOutKDV<=1000)
            KDV = withOutKDV*0.18f;
        else
            KDV = withOutKDV*0.08f;

        withKDV = withOutKDV + KDV;

        System.out.println("KDV: " + KDV);
        System.out.println("The fee with KDV: " + withKDV);
    }
}