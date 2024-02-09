package day13_self_practice.employee_task;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee = new Employee("Sam","Worker1","Plumber",55_000,"Pipes and Wrench");
        employee.work();
        System.out.println(employee);
        System.out.println("------------------");

        Tester tester = new Tester("Kevin","Tester2","SDET",80_000,"Meta");
        tester.work();
        System.out.println(tester);
        System.out.println("------------------");

        Developer developer = new Developer("Kate","Developer3","Junior Developer",90_000,"Google","Python");
        developer.work();
        System.out.println(developer);
        System.out.println("------------------");

        Teacher teacher = new Teacher("Mary","Teacher01","Elementary teacher",75_000,"PS 101");
        teacher.work();
        System.out.println(teacher);
        System.out.println("------------------");

        Driver driver = new Driver("Jack","Driver55","TLC Driver",65_000,"Uber");
        driver.work();
        System.out.println(driver);

    }

}
