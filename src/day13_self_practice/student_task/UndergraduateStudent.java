package day13_self_practice.student_task;

public class UndergraduateStudent extends StudentInfo{
    public UndergraduateStudent(String name, String gender, int age, String studentId, String fieldOfStudy, char grade, String schoolName, int willGraduate, String willEarn) {
        super(name, gender, age, studentId, fieldOfStudy, grade, schoolName);
        setWillGraduate(willGraduate);
        setWillEarn(willEarn);
    }



    private int willGraduate;
    private String willEarn;

    public int getWillGraduate() {
        return willGraduate;
    }

    public void setWillGraduate(int willGraduate) {
        if(willGraduate<=0){
            System.err.println("Year can't be negative or equal zero!");
            System.exit(1);
        }
        this.willGraduate = willGraduate;
    }

    public String getWillEarn() {
        return willEarn;
    }

    public void setWillEarn(String willEarn) {
        if(willEarn.isEmpty()||willEarn.isBlank()||willEarn==null){
            System.err.println("The degree that student will have must not be null, empty, or blank!");
            System.exit(1);
        }
        this.willEarn = willEarn;

    }
    @Override
    void study() {
        System.out.println("Student "+getName()+" will complete education at "+getSchoolName()+" on "+willGraduate);
    }

    @Override
    public String toString() {
        return super.toString()+ "{" +
                "willGraduate=" + willGraduate +
                ", willEarn='" + willEarn + '\'' +
                "}";
    }
}
