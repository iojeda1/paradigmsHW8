public class Course {
    private String name;
    private Student[] enrolledStudents;
    private String code;
    private Professor instructor;

    public Course(String name, String code, Professor instructor) {
        this.name = name;
        this.code = code;
        this.enrolledStudents = new Student[50];
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Professor getInstructor() {
        return instructor;
    }

    public Student[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public String addStudent(Student student) {
        if (student == null) {
            return;
        }
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                enrolledStudents[i] = student;
                return;
            }
        }
    }

    public String removeStudent(Student student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == student) {
                enrolledStudents[i] = null;
                return;
            }
        }
    }
}
