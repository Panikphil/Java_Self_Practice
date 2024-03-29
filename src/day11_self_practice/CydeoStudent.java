package day11_self_practice;

public class CydeoStudent {
    static String schoolName ="CYDEO",programmingLanguage="JAVA";

    String name,batchNumber;
    int age,id,groupNumber;
    char grade;


    public CydeoStudent(String name, int age, int id , char grade, String batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.batchNumber = batchNumber;
        this.id = id;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    public void study(){
        System.out.println(name+" is studying.");
    }
    public void attendClass(){
        System.out.println(name+" is attending the live class.");
    }
    public void printSchoolName(){
        System.out.println(CydeoStudent.schoolName);
    }
    public void printProgLanguage(){
        System.out.println(CydeoStudent.programmingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/*
4. Create a custom class named CydeoStudent with the following specifications:

	Attributes:
			name
			age
			id
			grade
			batchNumber
			groupNumber
			schoolName (static)
			programmingLanguage (static)

	Constructors:
			Add a constructor that can set all the fields

	Actions:
		study(): displays the name of the Cydeo student on the console with the concatenated message "is studying."
		attendClass(): displays the name of the Cydeo student on the console with the concatenated message "is attending the live class."
		printSchoolName(): displays the school name
		printProgLanguage(): displays the name of the programming language
		toString(): returns a string representation of the CydeoStudent object.


	Create another class named CydeoStudentClients, create multiple CydeoStudent objects, and test each function of the CydeoStudent object.

 */