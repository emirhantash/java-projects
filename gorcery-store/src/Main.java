import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float pear, apple, tomatoes, bananas, eggplant;
        Scanner input = new Scanner(System.in);

        /*
        * pear: 2,14$
        * apple: 3,67$
        * tomatoes: 1,11$
        * bananas: 0,95$
        * eggplant: 5,00$
        * */

        System.out.println("how many kilos of pears");
        pear = input.nextFloat();
        System.out.println("how many kilos of apples");
        apple = input.nextFloat();
        System.out.println("how many kilos of tomatoes");
        tomatoes = input.nextFloat();
        System.out.println("how many kilos of bananas");
        bananas = input.nextFloat();
        System.out.println("how many kilos of eggplants");
        eggplant = input.nextFloat();

        System.out.println("how many kilos of pears: " + pear);
        System.out.println("how many kilos of apples" + apple);
        System.out.println("how many kilos of tomatoes" + tomatoes);
        System.out.println("how many kilos of bananas" + bananas);
        System.out.println("how many kilos of aggplants" + eggplant);
        System.out.print("Total: " + (pear*2.14 + apple*3.67 + tomatoes*1.11 + bananas*0.95 + eggplant*5.00));
        System.out.print("$");
    }
}