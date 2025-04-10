public class Professor extends UniversityMember {
    private String department;

    public Professor(String name, String email, String id, String department) {
        super(name, email, id);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String getRole() {
        return "Professor";
    }

    @Override
    public String toString() {
        String[] name_divided = getName().split(" ");
        String last_name = name_divided[name_divided.length - 1];
        System.out.printf("Prof. %s (%s)", last_name, getEmail());
    }
}
