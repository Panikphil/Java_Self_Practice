package day13_self_practice.employee_task;

public class Teacher extends Employee{

    public Teacher(String name, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching");

    }
}
