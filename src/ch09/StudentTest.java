package ch09;

class Subject {
	String subjectName;
	int score;
	int subjectId;
}

class Student {
	String studentName;
	int studentId;
	
	Subject korea;
	Subject math;
	
	Student(int Id, String Name) {
		this.studentId = Id;
		this.studentName = Name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + "���� ������ " + total + "�� �Դϴ�.");
	}
}

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 95);
		
		
		Student studentKim = new Student(101, "Kim");
		studentKim.setKoreaSubject("����", 80);
		studentKim.setMathSubject("����", 99);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}
}
