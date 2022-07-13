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
		return studentName + "�л��� �й��� " + studentNumber + "�̰�, " + grade + "�г� �Դϴ�."; 
	}
}

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student(12345, "Kee", 3);

		String data = studentLee.showStudentInfo();
		System.out.println(data);
	}
}
