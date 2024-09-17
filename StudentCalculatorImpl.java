
import java.util.*;


public class StudentCalculatorImpl extends StudentCalculator {

    // Calculate total marks by iterating over each subject
    @Override
    public int calculateTotalMarks(List<Subject> subjects) {
        int total = 0;
        for (Subject subject : subjects) {
            total += subject.getMarks();
        }
        return total;
    }

    // Calculate percentage based on total marks and number of subjects
    @Override
    public double calculatePercentage(int totalMarks, int numberOfSubjects) {
        return (double) totalMarks / (numberOfSubjects * 100) * 100;
    }

}
