public class TA extends UniversityMember {
    private Course[] coursesAssisting;

    public TA(String name, String id, String email) {
        super(name, id, email);
        this.coursesAssisting = new Course[2];
    }

    public void assignToCourse(Course course) {
        for (Course c : coursesAssisting) {
            if (c == course) {
                return;
            }
        }
        for (int i = 0; i < coursesAssisting.length; i++) {
            if (coursesAssisting[i] == null) {
                coursesAssisting[i] = course;
                return;
            }
        }
    }

    public Course[] getCoursesAssisting() {
        return coursesAssisting;
    }

    @Override
    public String getRole() {
        return "TA";
    }

    @Override
    public String toString() {
        StringBuilder courses = new StringBuilder(); // string is immutable
        for (Course c : coursesAssisting) {
            if (c != null) {
                if (courses.length() > 0) {
                    courses.append(", ");
                }
                courses.append(c.getCode()); // implemented in Courses
            }
        }
        return String.format("%s (%s). TA for courses: ", getName(), getEmail(), courses.toString());
    }
}
