package day06_self_practice;

public class SalaryCalculator {
    public static void main(String[] args) {
salary(45,40);
    }

public static void salary (double hourlyRate,int weeklyHours){
        double income = hourlyRate*weeklyHours*52;
    System.out.println(income);
}

}

/*
Create a class named SalaryCalculator and create a method named salary that takes hourly rate (double)
and weekly hours (int) and returns the salary.

			Example:
				double income = salary(45, 40);

			Output:
				93600.0

 */