package day11_self_practice;

public class Employee {

    String name,jobTitle;
    int age;
    char gender;
    double salary;


    public String work(){
       return jobTitle+" "+name+" is working.";
    }

    public Employee(){
    }
    public Employee(String name) {
        this.name = name;

    }

    public Employee(String name, String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, int age) {
        this(name, jobTitle);
        this.age = age;
    }

    public Employee(String name, String jobTitle, int age, char gender) {
        this(name, jobTitle, age);
        this.gender = gender;
    }

    public Employee(String name, String jobTitle, int age, char gender, double salary) {
        this(name, jobTitle, age, gender);
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary + " "+
                work()+
                '}';
    }
}
/*
reate a custom class named Employee with the following specifications:

	Attributes:
			name (String)
			age (int)
			gender (char)
			jobTitle (String)
			salary (double)

    Constructors:
			Add multiple constructors to set different fields of the employee object.

    Actions:
		work(): prints the job title and name of the employee concatenated with " is working."
		toString(): returns a string representation of the employee object.

	Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.

 */