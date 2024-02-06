package day11_self_practice;

public class CydeoStudentClients {
    public static void main(String[] args) {

       CydeoStudent student1 = new CydeoStudent("Jack",24,1,'A',"B30",5);
       student1.study();
       student1.attendClass();
       student1.printSchoolName();
       student1.printProgLanguage();
        System.out.println(student1);

        System.out.println("----------------------");

    CydeoStudent student2 = new CydeoStudent("Sara",31,2,'B',"B32",2);
    student2.study();
    student2.attendClass();
    student2.printSchoolName();
    student2.printProgLanguage();
        System.out.println(student2);

    }
}

