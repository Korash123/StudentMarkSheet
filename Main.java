import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
       
        StudentService studentService  = new StudentService();


        List<Student> students = studentService.inputStudent();

        studentService.processStudent(students);

    }
            
}
