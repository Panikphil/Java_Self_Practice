package day13_self_practice.student_task;

public class CydeoStudent extends StudentInfo{
    public CydeoStudent(String name, String gender, int age, String studentId, String fieldOfStudy, char grade, String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, gender, age, studentId, fieldOfStudy, grade, schoolName);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

        private int batchNumber;
        private int groupNumber;
        private String programmingLanguage;

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber<=0){
            System.err.println("Batch number can't be negative or equal zero!");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber<=0){
            System.err.println("Group number can't be negative or equal zero!");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage.isEmpty()||programmingLanguage.isBlank()||programmingLanguage==null){
            System.err.println("Programming language name must not be null, empty, or blank!");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void study() {
        System.out.println("Cydeo Student "+getName()+" is studing " + getProgrammingLanguage()+" at group "+getGroupNumber()+ " of the batch "+getBatchNumber());
    }

    @Override
    public String toString() {
        return super.toString() +"{" +
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                "}";
    }


}

