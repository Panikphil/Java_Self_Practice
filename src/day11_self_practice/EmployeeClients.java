package day11_self_practice;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee("John");
        Employee employee3 = new Employee("Tom","SDET");
        Employee employee4= new Employee("Sam","PM",25);
        Employee employee5= new Employee("Sara","Designer",33,'F');
        Employee employee6=new Employee("Peter","Developer",45,'M',120_000);


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
        System.out.println(employee6);
    }
}
