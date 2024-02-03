package day07_self_practice;

public class EmployeeClients {
    public static void main(String[] args) {


        Employee person1 = new Employee();
        person1.name = "John";
        person1.age = 20;
        person1.gender = 'M';
        person1.jobTitle = "SDET";
        person1.salary = 100_000.00;

        person1.work();
        System.out.println(person1);

        System.out.println("----------------------");

        Employee person2 = new Employee();

        person2.name = "Sara";
        person2.age = 32;
        person2.gender = 'F';
        person2.jobTitle = "Designer";
        person2.salary = 80_000.00;

        person2.work();
        System.out.println(person2);




    }


}
