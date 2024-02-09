package day13_self_practice.student_task;

public class StudentInfo extends Student{
    public StudentInfo(String name, String gender, int age, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, gender, age);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    private String studentId,fieldOfStudy;
    private char grade;
    private String schoolName;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if(studentId.isEmpty()||studentId.isBlank()||studentId==null){
            System.err.println("Student ID must not be null, empty, or blank!");
            System.exit(1);
        }
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy.isEmpty()||fieldOfStudy.isBlank()||fieldOfStudy==null){
            System.err.println("Field of study must not be null, empty, or blank!");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(grade=='0'||grade==' '|| !Character.isLetterOrDigit(grade)){
            System.err.println("Grade must not be zero, empty, or blank!");
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }



    public void setSchoolName(String schoolName) {
        if(schoolName.isEmpty()||schoolName.isBlank()||schoolName==null){
            System.err.println("School name must not be null, empty, or blank!");
            System.exit(1);
        }
        this.schoolName = schoolName;

    }

    void study() {
        System.out.println("Student "+getName()+" attends "+getSchoolName());
    }

    @Override
    public String toString() {
        return super.toString() +
                "studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                "}";
    }
}








