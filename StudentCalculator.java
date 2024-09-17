
import java.util.*;

public abstract class StudentCalculator {

	 // Abstract method for total marks
    public abstract int calculateTotalMarks(List<Subject> subjects); 

    // Abstract method for percentage
    public abstract double calculatePercentage(int totalMarks, int numberOfSubjects);  
}
