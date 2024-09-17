

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StudentService{
	Scanner scanner = new Scanner(System.in);

	public StudentCalculatorImpl StudentCalculatorImpl = new StudentCalculatorImpl();

	//method to gather the student number and their subject

	public List<Student> inputStudent(){

		List<Student> students = new ArrayList<>();

		System.out.print("Enter the Total number of Student : ");
		int numberOfStudent = scanner.nextInt();

		for(int s =0; s<numberOfStudent; s++){
			scanner.nextLine();
			System.out.print("\n Enter the Student name : ");
			String studentName = scanner.nextLine();

			System.out.print("Enter the Total subject : ");

			List<Subject> subjects = new ArrayList<>();
			int numberOfSubject = scanner.nextInt();


			for (int i =0; i <numberOfSubject; i++) {
				scanner.nextLine();
				System.out.print("Enter Subject name : ");
				String subjectName= scanner.nextLine();
				System.out.print("Enter Marks for " +subjectName+ " : " );
				int marks = scanner.nextInt();
				subjects.add(new Subject(subjectName,marks));
			}
			students.add(new Student(studentName,subjects));

		}
		return students;
	}


	public void processStudent(List<Student> students){
		for(Student student : students){
			int totalMarks =  StudentCalculatorImpl.calculateTotalMarks(student.getSubjects());
            double percentage = StudentCalculatorImpl.calculatePercentage(totalMarks, student.getSubjects().size());

			//Display
			System.out.println("\n Student Name : " +student.getName());
			System.out.println("Total Marks : " +totalMarks);
			System.out.println("percentage of : " +percentage);
		}
	}

}