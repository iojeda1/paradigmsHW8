public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Prof. Santos", "jdasilv2@nd,edu", "100", "CSE");
        Professor prof2 = new Professor("Patricio Sumaza", "psumaza@nd.edu", "101", "CPEG");

        Course course1 = new Course("Programming Paradigms", "CSE30332", prof1);
        Course course2 = new Course("Physics 2", "PHYS2", prof2);

        TA ta1 = new TA("Micah Brody", "T1", "mbrody@nd.edu");
        TA ta2 = new TA("Sahil Khandelwal", "T2", "skhandel@nd.edu");
        TA ta3 = new TA("Kaixiang Zhao", "T3", "kzhao5@nd.edu");
        TA ta4 = new TA("Ella Gerzack", "TA4", "egerczak@nd.edu");
        TA ta5 = new TA("Saofia Rexach", "TA5", "srexach@nd.edu");

        Student s1 = new Student("Carlo Marra", "S1", "cmarra@nd.edu", "Neuroscience");
        Student s2 = new Student("Phoebe Huang", "S2", "phuang@nd.edu", "CSE");
        Student s3 = new Student("Juan Pablo Rubero", "S3", "jprubero@nd.edu", "EE");

        ta1.assignToCourse(course1);
        ta2.assignToCourse(course1);
        ta3.assignToCourse(course1);
        ta4.assignToCourse(course1);
        ta5.assignToCourse(course2);

        course1.addStudent(s1);
        course1.addStudent(s2);
        course1.addStudent(s3);
        course2.addStudent(s1);
        course2.addStudent(s2);
        course2.addStudent(s3);
        // debug
        System.out.println(prof1);
        System.out.println(course1.getInstructor());
        System.out.println(ta1);
        System.out.println(ta2);
        System.out.println(ta5);
        System.out.println(s1);

    }
}
