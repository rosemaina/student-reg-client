package project2.demo;

public class Student {

    private Long id;
    private String studentName;
    private int studentNumber;
    private String enrollmentKey;
    private Boolean validated;

    private Unit unit = new Unit();

    public Student(String studentName, int studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    public Student( Boolean validated) {

        this.validated = validated;
    }

    public Student(Long id,String enrollmentKey) {
        this.id = id;
        this.enrollmentKey = enrollmentKey;
    }

    public Student() { }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public int getStudentNumber() { return studentNumber; }
    public void setStudentNumber(int studentNumber) { this.studentNumber = studentNumber; }

    public String getEnrollmentKey() { return enrollmentKey; }
    public void setEnrollmentKey(String enrollmentKey) { this.enrollmentKey = enrollmentKey; }

    public Boolean getValidated() { return validated; }
    public void setValidated(Boolean validated) { this.validated = validated; }

    public Student(Unit unit) { this.unit = unit; }

    public Unit getUnit() { return unit; }
    public void setUnit(Unit unit) { this.unit = unit; }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentNumber=" + studentNumber +
                ", enrollmentKey='" + enrollmentKey + '\'' +
                ", validated=" + validated +
                '}';
    }
}
