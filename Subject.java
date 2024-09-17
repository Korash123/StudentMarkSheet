// Entity

class Subject{
    private String subjectName;
    private int marks;

    // Constructor
    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    // Getters
    public String getSubjectName() {
        return subjectName;
    }

    public int getMarks() {
        return marks;
    }

    // Setters
    public void setMarks(int marks) {
        this.marks = marks;
    }
}

	