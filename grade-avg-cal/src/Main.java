import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math1, math2, math3 = 0, physics1, physics2, physics3 = 0, chemistry1, chemistry2, chemistry3 = 0, english1, english2,english3 = 0, history1, history2, history3 = 0;
        float mathAvg, physicsAvg, chemistryAvg, englishAvg, historyAvg;
        boolean mathDidItPass = true, physicsDidItPass = true, chemistryDidItPass = true, englishDidItPass = true, historyDidItPass = true;

        Scanner input = new Scanner(System.in);

        System.out.println("please enter your math midterm exam's grade");
        math1 = input.nextInt();
        System.out.println("please enter your math final exam's grade");
        math2 = input.nextInt();
        mathAvg = (0.4f * math1) + (0.6f * math2);
        if(math2<50 || mathAvg<50) {
            System.out.println("please enter your math makeup exam's grade");
            math3 = input.nextInt();
            mathAvg = (0.4f * math1) + (0.6f * math3);
            if(math3<50 || mathAvg<50)
                mathDidItPass = false;
        }

        System.out.println("please enter your physics midterm exam's grade");
        physics1 = input.nextInt();
        System.out.println("please enter your physics final exam's grade");
        physics2 = input.nextInt();
        physicsAvg = (0.4f * physics1) + (0.6f * physics2);
        if(physics2<50 || physicsAvg<50) {
            System.out.println("please enter your physics makeup exam's grade");
            physics3 = input.nextInt();
            physicsAvg = (0.4f * physics1) + (0.6f * physics3);
            if(physics3<50 || physicsAvg<50)
                physicsDidItPass = false;
        }

        System.out.println("please enter your chemistry midterm exam's grade");
        chemistry1 = input.nextInt();
        System.out.println("please enter your chemistry final exam's grade");
        chemistry2 = input.nextInt();
        chemistryAvg = (0.4f * chemistry1) + (0.6f * chemistry2);
        if(chemistry2<50 || chemistryAvg<50) {
            System.out.println("please enter your chemistry makeup exam's grade");
            chemistry3 = input.nextInt();
            chemistryAvg = (0.4f * chemistry1) + (0.6f * chemistry3);
            if(chemistry3<50 || chemistryAvg<50)
                chemistryDidItPass = false;
        }
        System.out.println("please enter your english midterm exam's grade");
        english1 = input.nextInt();
        System.out.println("please enter your english final exam's grade");
        english2 = input.nextInt();
        englishAvg = (0.4f * english1) + (0.6f * english2);
        if(english2<50 || englishAvg<50) {
            System.out.println("please enter your english makeup exam's grade");
            english3 = input.nextInt();
            englishAvg = (0.4f * english1) + (0.6f * english3);
            if(english3<50 || englishAvg<50)
                englishDidItPass = false;
        }

        System.out.println("please enter your history midterm exam's grade");
        history1 = input.nextInt();
        System.out.println("please enter your history final exam's grade");
        history2 = input.nextInt();
        historyAvg = (0.4f * history1) + (0.6f * history2);
        if(history2<50 || historyAvg<50) {
            System.out.println("please enter your history makeup exam's grade");
            history3 = input.nextInt();
            historyAvg = (0.4f * history1) + (0.6f * history3);
            if(history3<50 || historyAvg<50)
                historyDidItPass = false;
        }

        System.out.print("Mathematic\nMidterm:  " + math1);
        System.out.print(" Final:  " + math2);
        System.out.print(" Makeup:  " + math3);
        System.out.print(" AVG:  " + mathAvg);
        if(mathDidItPass == false)
            System.out.println(" Failed");
        else
            System.out.println(" Passed");

        System.out.print("Physics\nMidterm:  " + physics1);
        System.out.print(" Final:  " + physics2);
        System.out.print(" Makeup:  " + physics3);
        System.out.print(" AVG:  " + physicsAvg);
        if(physicsDidItPass == false)
            System.out.println(" Failed");
        else
            System.out.println(" Passed");

        System.out.print("Chemistry\nMidterm:  " + chemistry1);
        System.out.print(" Final:  " + chemistry2);
        System.out.print(" Makeup:  " + chemistry3);
        System.out.print(" AVG:  " + chemistryAvg);
        if(chemistryDidItPass == false)
            System.out.println(" Failed");
        else
            System.out.println(" Passed");

        System.out.print("English\nMidterm:  " + english1);
        System.out.print(" Final:  " + english2);
        System.out.print(" Makeup:  " + english3);
        System.out.print(" AVG:  " + englishAvg);
        if(englishDidItPass == false)
            System.out.println(" Failed");
        else
            System.out.println(" Passed");

        System.out.print("History\nMidterm:  " + history1);
        System.out.print(" Final:  " + history2);
        System.out.print(" Makeup:  " + history3);
        System.out.print(" AVG:  " + historyAvg);
        if(historyDidItPass == false)
            System.out.println(" Failed");
        else
            System.out.println(" Passed");
    }
}