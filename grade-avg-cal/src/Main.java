import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math1 = 0, math2 = 0, math3 = 0, mathMidtermCounter = 0, mathFinalCounter = 0, mathMakeupCounter = 0, physics1 = 0, physics2 = 0, physics3 = 0, physicsMidtermCounter = 0, physicsFinalCounter = 0, physicsMakeupCounter = 0, chemistry1 = 0, chemistry2 = 0, chemistry3 = 0, chemistryMidtermCounter = 0, chemistryFinalCounter = 0, chemistryMakeupCounter = 0, english1 = 0, english2 = 0, english3 = 0, englishMidtermCounter = 0, englishFinalCounter = 0, englishMakeupCounter = 0, history1 = 0, history2 = 0, history3 = 0, historyMidtermCounter = 0, historyFinalCounter = 0, historyMakeupCounter = 0;
        Scanner input = new Scanner(System.in);
        do {
            if(mathMidtermCounter > 0)
                System.out.println("Error! Invalid grade");
            System.out.println("Please enter your math midterm exam's grade:");
            math1 = input.nextInt();
            mathMidtermCounter++;
        } while(math1 < 0 || math1 > 100);
        do {
            if(mathFinalCounter > 0)
                System.out.println("Error! Invalid grade");
            System.out.println("Please enter your math final exam's grade:");
            math2 = input.nextInt();
            mathFinalCounter++;
        } while(math2 < 0 || math2 > 100);
        if(math2 < 55 || (0.4 * math1 + 0.6 * math2) < 55)
            do {
                if(mathMakeupCounter > 0)
                    System.out.println("Error! Invalid grade");
                System.out.println("Please enter your math makeup exam's grade:");
                math3 = input.nextInt();
                mathMakeupCounter++;
                } while(math3 < 0 || math3 > 100);

        do {
            if(physicsMidtermCounter > 0)
                System.out.println("Error! Invalid grade");
            System.out.println("Please enter your physics midterm exam's grade:");
            physics1 = input.nextInt();
            physicsMidtermCounter++;
        } while(physics1 < 0 || physics1 > 100);
        do {
            if(physicsFinalCounter > 0)
                System.out.println("Error! Invalid grade");
            System.out.println("Please enter your physics final exam's grade:");
            physics2 = input.nextInt();
            physicsFinalCounter++;
        } while(physics2 < 0 || physics2 > 100);
        if(physics2 < 55 || (0.4 * physics1 + 0.6 * physics2) < 55)
        do {
            if(physicsMakeupCounter > 0)
                System.out.println("Error! Invalid grade");
            System.out.println("Please enter your physics makeup exam's grade:");
            physics3 = input.nextInt();
            physicsMakeupCounter++;
        } while(physics3 < 0 || physics3 > 100);

        do {
            if(chemistryMidtermCounter > 0)
                System.out.println("Error! Invalid grade");
            System.out.println("Please enter your chemistry midterm exam's grade:");
            chemistry1 = input.nextInt();
            physicsMidtermCounter++;
        } while(chemistry1 < 0 || chemistry1 > 100);
        do {
            if(chemistryFinalCounter > 0)
                System.out.println("Error! Invalid grade");
            System.out.println("Please enter your chemistry final exam's grade:");
            chemistry2 = input.nextInt();
            chemistryFinalCounter++;
        } while(chemistry2 < 0 || chemistry2 > 100);
        if(chemistry2 < 55 || (0.4 * chemistry1 + 0.6 * chemistry2) < 55)
            do {
                if(chemistryMakeupCounter>0)
                    System.out.println("Error! Invalid grade");
                System.out.println("Please enter your chemistry makeup exam's grade:");
                physics3 = input.nextInt();
                chemistryMakeupCounter++;
            } while(physics3 < 0 || physics3 > 100);

        do {
            if(englishMidtermCounter > 0)
                System.out.println("Error! Invalid grade");
            System.out.println("Please enter your english midterm exam's grade:");
            english1 = input.nextInt();
            englishMidtermCounter++;
        } while(english1 < 0 || english1 > 100);
        do {
            if(englishFinalCounter > 0)
                System.out.println("Error! Invalid grade");
            System.out.println("Please enter your english final exam's grade:");
            english2 = input.nextInt();
            englishFinalCounter++;
        } while(english2 < 0 || english2 > 100);
        if(english2 < 55 || (0.4 * english1 + 0.6 * english2) < 55)
            do {
                if(englishMakeupCounter>0)
                    System.out.println("Error! Invalid grade");
                System.out.println("Please enter your english makeup exam's grade:");
                english3 = input.nextInt();
                englishMakeupCounter++;
            } while(english3 < 0 || english3 > 100);

        do {
            if(historyMidtermCounter > 0)
                System.out.println("Error! Invalid grade");
            System.out.println("Please enter your history midterm exam's grade:");
            english1 = input.nextInt();
            historyMidtermCounter++;
        } while(history1 < 0 || history1 > 100);
        do {
            if(historyFinalCounter > 0)
                System.out.println("Error! Invalid grade");
            System.out.println("Please enter your history final exam's grade:");
            english2 = input.nextInt();
            historyFinalCounter++;
        } while(history2 < 0 || history2 > 100);
        if(history2 < 55 || (0.4 * history1 + 0.6 * history2) < 55)
            do {
                if(historyMakeupCounter>0)
                    System.out.println("Error! Invalid grade");
                System.out.println("Please enter your history makeup exam's grade:");
                history3 = input.nextInt();
                historyMakeupCounter++;
            } while(history3 < 0 || history3 > 100);

        System.out.print("Math Midterm: " + math1 + " Final: " + math2);
        if(math3 == 0) {
            System.out.print(" AVG: " + (0.4 * math1 + 0.6 * math2));
            if((0.4 * math1 + 0.6 * math2) < 55)
                System.out.println(" Failed");
            else
                System.out.println(" Passed");
        }
        else {
            System.out.print(" Makeup: " + math3 + "AVG: " + (0.4 * math1 + 0.6 * math3));
            if((0.4 * math1 + 0.6 * math3) < 55)
                System.out.println(" Failed");
            else
                System.out.println(" Passed");
        }

        System.out.print("Physics Midterm: " + physics1 + " Final: " + physics2);
        if(physics3 == 0) {
            System.out.print(" AVG: " + (0.4 * physics1 + 0.6 * physics2));
            if((0.4 * physics1 + 0.6 * physics2) < 55)
                System.out.println(" Failed");
            else
                System.out.println(" Passed");
        }
        else {
            System.out.print(" Makeup: " + physics3 + "AVG: " + (0.4 * physics1 + 0.6 * physics3));
            if((0.4 * physics1 + 0.6 * physics3) < 55)
                System.out.println(" Failed");
            else
                System.out.println(" Passed");
        }

        System.out.print("Chemistry Midterm: " + chemistry1 + " Final: " + chemistry2);
        if(chemistry3 == 0) {
            System.out.print(" AVG: " + (0.4 * chemistry1 + 0.6 * chemistry2));
            if((0.4 * chemistry1 + 0.6 * chemistry2) < 55)
                System.out.println(" Failed");
            else
                System.out.println(" Passed");
        }
        else {
            System.out.print(" Makeup: " + chemistry3 + "AVG: " + (0.4 * chemistry1 + 0.6 * chemistry3));
            if((0.4 * chemistry1 + 0.6 * chemistry3) < 55)
                System.out.println(" Failed");
            else
                System.out.println(" Passed");
        }

        System.out.print("English Midterm: " + english1 + " Final: " + english2);
        if(english3 == 0) {
            System.out.print(" AVG: " + (0.4 * english1 + 0.6 * english2));
            if((0.4 * english1 + 0.6 * english2) < 55)
                System.out.println(" Failed");
            else
                System.out.println(" Passed");
        }
        else {
            System.out.print(" Makeup: " + english3 + "AVG: " + (0.4 * english1 + 0.6 * english3));
            if((0.4 * english1 + 0.6 * english3) < 55)
                System.out.println(" Failed");
            else
                System.out.println(" Passed");
        }

        System.out.print("History Midterm: " + history1 + " Final: " + history2);
        if(history3 == 0) {
            System.out.print(" AVG: " + (0.4 * history1 + 0.6 * history2));
            if((0.4 * history1 + 0.6 * history2) < 55)
                System.out.println(" Failed");
            else
                System.out.println(" Passed");
        }
        else {
            System.out.print(" Makeup: " + history3 + "AVG: " + (0.4 * history1 + 0.6 * history3));
            if((0.4 * history1 + 0.6 * history3) < 55)
                System.out.println(" Failed");
            else
                System.out.println(" Passed");
        }

    }
}