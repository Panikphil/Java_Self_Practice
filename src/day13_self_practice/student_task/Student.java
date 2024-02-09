package day13_self_practice.student_task;

public class Student {
    private String name,gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()||name.isBlank()||name==null){
            System.err.println("Name must not be null, empty, or blank!");
            System.exit(1);
        }
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(gender.isEmpty()||gender.isBlank()||gender==null){
            System.err.println("Gender must not be null, empty, or blank!");
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.err.println("Age can't be negative or equal zero!");
            System.exit(1);
        }
        this.age = age;
    }

    public Student(String name, String gender, int age) {
        setName(name);
        setGender(gender);
        setAge(age);
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ',';
    }
}
/*
 Create a class named "Student" with the following specifications:
   Attributes:
       - name: String
       - age: int
       - gender: String

   Encapsulation:
       - Same as previous tasks.

   Constructor:
       - Same as previous tasks.

   Actions:
       - toString(): Prints the information of the Student object.

 */