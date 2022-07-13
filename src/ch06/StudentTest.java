package ch06;

class Student {
	
	int studentNumber;
	String studentName;
	int grade;

	Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	String showStudentInfo() {
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다."; 
	}
}

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student(12345, "Kee", 3);

		String data = studentLee.showStudentInfo();
		System.out.println(data);
	}
}
