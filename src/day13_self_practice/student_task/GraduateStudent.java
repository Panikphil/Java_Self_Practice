package day13_self_practice.student_task;

public class GraduateStudent extends StudentInfo{
    public GraduateStudent(String name, String gender, int age, String studentId, String fieldOfStudy, char grade, String schoolName, int yearOfGraduation, String studentDegree) {
        super(name, gender, age, studentId, fieldOfStudy, grade, schoolName);
        setYearOfGraduation(yearOfGraduation);
        setStudentDegree(studentDegree);
    }
    private int yearOfGraduation;
    private String studentDegree;

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(int yearOfGraduation) {
        if(yearOfGraduation<=0){
            System.err.println("Year can't be negative or equal zero!");
            System.exit(1);
        }
        this.yearOfGraduation = yearOfGraduation;
    }

    public String getStudentDegree() {
        return studentDegree;
    }

    public void setStudentDegree(String studentDegree) {
        if(studentDegree.isEmpty()||studentDegree.isBlank()||studentDegree==null){
            System.err.println("Student degree must not be null, empty, or blank!");
            System.exit(1);
        }
        this.studentDegree = studentDegree;
    }



    @Override
    void study() {
        System.out.println("Student "+getName()+" has finished "+getSchoolName()+" at "+getYearOfGraduation());
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "yearOfGraduation=" + yearOfGraduation +
                ", studentDegree='" + studentDegree + '\'' +
                "}";
    }
}
