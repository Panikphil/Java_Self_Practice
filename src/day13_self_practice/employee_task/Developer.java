package day13_self_practice.employee_task;

public class Developer extends Employee{

    public Developer(String name, String employeeId, String jobTitle, double salary, String companyName, String programmingLanguage) {
        super(name, employeeId, jobTitle, salary, companyName);
        setProgrammingLanguage(programmingLanguage);
    }

    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage.isEmpty()||programmingLanguage.isBlank()||programmingLanguage==null){
            System.err.println("Programming language must not be null, empty, or blank.");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is coding in "+getProgrammingLanguage());
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                "}";
    }
}
