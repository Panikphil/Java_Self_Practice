package day13_self_practice.employee_task;

public class Employee {

    private String name,employeeId,jobTitle;
    private double salary;
    private String companyName;

    public Employee(String name, String employeeId, String jobTitle, double salary, String companyName) {
        setName(name);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompanyName(companyName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()||name.isBlank()||name==null){
            System.err.println("Name must not be null, empty, or blank.");
            System.exit(1);
        }
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if(employeeId.isEmpty()||employeeId.isBlank()||employeeId==null){
            System.err.println("Employee Id must not be null, empty, or blank!");
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isEmpty()||jobTitle.isBlank()||jobTitle==null){
            System.err.println("Name must not be null, empty, or blank!");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("Salary can't be negative!");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if(companyName.isEmpty()||companyName.isBlank()||companyName==null){
            System.err.println("Company name must not be null, empty, or blank.");
            System.exit(1);
        }
        this.companyName = companyName;

    }

    public void work(){
        System.out.println("Employee "+getName()+" is a "+getJobTitle());
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
/*
Employee Task Requirements:
1. Create a subclass of Person named "Employee" with the following specifications:
   Attributes:
       - employeeId: String
       - jobTitle: String
       - salary: double
       - companyName: String

   Encapsulation:
       - Same as previous tasks.

   Constructor:
       - Same as previous tasks.

   Methods:
       - work(): Displays the employee's job title and name.
       - toString(): Returns a string representation of the Employee object.

2. Create the following subclasses of Employee:
   2.1 Tester:
       - work(): Displays "[jobTitle] [name] is testing".

   2.2 Developer:
       - Extra Variable:
           - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".

   2.3 Teacher:
       - work(): Displays "[name] is teaching".

   2.4 Driver:
       - work(): Displays "[name] is driving".

   - Add any additional fields or methods as necessary.

3. Create a class named "EmployeeClients":
   - Create multiple objects representing different employees.
   - Test the methods and attributes of each object.

 */