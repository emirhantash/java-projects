# **Salary Calculator**

*We write a class called "Employee" that represents factory workers and calculates employee salaries with its methods in Java.*

### **Employee Class Properties**
* #### Qualifications:
  * ***name***: Employee's first and last name
  * ***salary***: Employee's salary
  * ***workHours***: Weekly working hours
  * ***hireYear***: The year that Employee's hiring year
* #### Methods:
  * ***Employee(name, salary, workHours, hireYear)***: It is a constructor method and will take 4 parameters.
  * ***tax()***: It will calculate the tax applied to the salary.
    * If the employee's salary is less than 1000$, no tax will be applied.
    * If the employee's salary is more than 1000$, 3% of his/her salary will be taxed.
  * ***bonus()***: If the employee has worked more than 40 hours a week, he/she will calculate bonus wages of 30$ per hour of extra work.
  * ***raiseSalary()***: It will calculate the salary increase based on the employee's starting year. We take the current year as 2023.
    * If the employee has been working for less than 10 years, his/her salary will be increased by 5%.
    * If the employee has worked for more than 9 years and less than 20 years, her salary will be increased by 10%.
    * If the employee has been working for more than 19 years, a 15% raise will be made.
  * ***printInfo()***: It will print the employee's information on the screen.