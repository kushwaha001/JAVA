class Teacher {
    private String teacherID;
    private String name;
    private String subject;

    public Teacher(String teacherID, String name, String subject) {
        this.teacherID = teacherID;
        this.name = name;
        this.subject = subject;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void displayDetails() {
        System.out.println("Teacher ID: " + teacherID);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
    }
}
class Student extends Teacher {
    private String studentID;
    private int gradeLevel;


    public Student(String teacherID, String name, String subject, String studentID, int gradeLevel) {
        super(teacherID, name, subject);
        this.studentID = studentID;
        this.gradeLevel = gradeLevel;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentID);
        System.out.println("Grade Level: " + gradeLevel);
    }
}
public class xtenduse {
    public static void main(String[] args) {
        Student student = new Student("T01", "Mr. Smith", "Mathematics", "S01", 10);
        System.out.println("Student Details:");
        student.displayDetails();
    }
}
