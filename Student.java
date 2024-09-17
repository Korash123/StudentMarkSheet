import java.util.List;



public class Student {
    private String name;
    private List<Subject> subjects;  // List of subjects

    // Constructor
    public Student(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}
