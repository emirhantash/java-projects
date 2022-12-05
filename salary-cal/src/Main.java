import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double salary;
        int workHours, hireYear;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the employee's name: ");
        String name = scan.nextLine();
        do {
            System.out.println("Please enter the employee's salary: ");
            salary = scan.nextDouble();
        }while(salary < 0);
        do {
            System.out.println("Please enter the employee's weekly working hours: ");
            workHours = scan.nextInt();
        }while(workHours < 0 || workHours > 168);
        do {
            System.out.println("Please enter the employee's hiring year: ");
            hireYear = scan.nextInt();
        }while(hireYear < 0 || hireYear > 2023);
        Employee e = new Employee(name, salary, workHours, hireYear);
        e.printInfo();
    }
}