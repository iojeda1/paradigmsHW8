public abstract class UniversityMember {
    private String name;
    private String id;
    private String email;

    public UniversityMember(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public abstract String getRole(); // public abstract method. every subclass must provide an implementation.

    // getter methods
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
