package day13_self_practice.student_task;

public class StudentClients {

    public static void main(String[] args) {

        Student student = new Student("John","Male",30);
        System.out.println(student);

        System.out.println("-----------------");

        StudentInfo student1 = new StudentInfo("Sara","Female",25,"A157","Chemistry",'B',"Harvard");
        student1.study();
        System.out.println(student1);

        System.out.println("--------------------");

        GraduateStudent graduateStudent = new GraduateStudent("John","Male",40,"C223","Finance",'A',
                "Princeton" ,2010,"Bachelor");
        graduateStudent.study();
        System.out.println(graduateStudent);

        System.out.println("------------------");

        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Lisa","Female",23,"A212","Physics",'A',
                "MIT",2025,"Bachelor");
        undergraduateStudent.study();
        System.out.println(undergraduateStudent);

        System.out.println("------------------");

        CydeoStudent cydeoStudent = new CydeoStudent("Mike","Male",32,"M23","Biology",'b',"Stamford",
                33,8,"Java");
         cydeoStudent.study();
        System.out.println(cydeoStudent);

    }




}
