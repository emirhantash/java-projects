import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day = 0, month = 0, counter1 = 0, counter2 = 0;
        Scanner imp = new Scanner(System.in);
        do {
            if(counter1 > 0)
                System.out.println("Invalid ");
            else {
                System.out.println("Please enter your birth month:");
                month = imp.nextInt();
            }
            counter1++;
        }while(month < 1 || month > 12);

        do {
            if(counter2 > 0)
                System.out.println("Invalid ");
            else {
                System.out.println("Please enter your birth day:");
                day = imp.nextInt();
            }
            counter2++;
        }while(month < 1 || month > 31);



        if(month == 1){
            if(day >= 1 || day <= 21)
                System.out.println("Capricorn");
            else if(day > 22 || day <= 31)
                System.out.println("Aquarius");
        }

        else if(month == 2){
            if(day >= 1 || day <= 19)
                System.out.println("Aquarius");
            else if(day > 19 || day <= 28)
                System.out.println("Pisces");
        }

        else if(month == 3){
            if(day >= 1 || day <= 20)
                System.out.println("Pisces");
            else if(day > 20 || day <= 31)
                System.out.println("Aries");
        }

        else if(month == 4){
            if(day >= 1 || day <= 20)
                System.out.println("Aries");
            else if(day > 20 || day <= 30)
                System.out.println("Taurus");
        }

        else if(month == 5){
            if(day >= 1 || day <= 21)
                System.out.println("Taurus");
            else if(day > 21 || day <= 31)
                System.out.println("Gemini");
        }

        else if(month == 6){
            if(day >= 1 || day <= 22)
                System.out.println("Gemini");
            else if(day > 22 || day <= 30)
                System.out.println("Cancer");
        }

        else if(month == 7){
            if(day >= 1 || day <= 22)
                System.out.println("Cancer");
            else if(day > 22 || day <= 31)
                System.out.println("Leo");
        }

        else if(month == 8){
            if(day >= 1 || day <= 22)
                System.out.println("Leo");
            else if(day > 22 || day <= 31)
                System.out.println("Virgo");
        }

        else if(month == 9){
            if(day >= 1 || day <= 22)
                System.out.println("Virgo");
            else if(day > 22 || day <= 30)
                System.out.println("Libra");
        }

        else if(month == 10){
            if(day >= 1 || day <= 22)
                System.out.println("Libra");
            else if(day > 22 || day <= 31)
                System.out.println("Scorpio");
        }

        else if(month == 11){
            if(day >= 1 || day <= 21)
                System.out.println("Scorpio");
            else if(day > 21 || day <= 30)
                System.out.println("Sagittarius");
        }

        else if(month == 12){
            if(day >= 1 || day <= 21)
                System.out.println("Sagittarius");
            else if(day > 21 || day <= 31)
                System.out.println("Capricorn");
        }

    }
}