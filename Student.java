public class Student extends UniversityMember {
    private String major;

    public Student(String name, String id, String email, String major) {
        super(name, id, email);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public String toString() { // name and email are private
        System.out.printf("%s (%s) - Major: %s", getName(), getEmail(), major);
    }
}
