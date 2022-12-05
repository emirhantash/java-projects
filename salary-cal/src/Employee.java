public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){
        if(this.salary >= 1000)
            return this.salary * 0.03;
        return 0.0;
    }
    double bonus(){
        if(this.workHours > 40)
            return (workHours-40) * 30.0;
        return 0.0;
    }
    double raiseSalary(){
        if(2023 - this.hireYear < 10)
            return this.salary * 0.05;
        else if(2023 - this.hireYear > 9 && 2023 - this.hireYear < 20)
            return this.salary * 0.1;
        else if(2023 - this.hireYear > 19)
            return this.salary * 0.15;
        return 0.0;
    }
    void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Weekly working hours: " + this.workHours);
        System.out.println("Hiring Year: " + this.hireYear);
        System.out.println("Tax: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Salary Raising: " + this.raiseSalary());
        System.out.println("Salary with tax and bonuses: " + (this.salary - this.tax() + this.bonus()));
        System.out.println("Total Salary: " + (this.salary - this.tax() + this.bonus() + this.raiseSalary()));
    }
}
