package Chapter02;

class subject {
	String subjectName;
	int score;
	int subjectId;
}

class Student2 {
	
	int studentId;
	String studentName;
	
	subject korea;
	subject math;
	
	public Student2(int id, String name) {
		studentId = id;
		studentName = name;
		
		korea = new subject();
		math = new subject();
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
		System.out.println(studentName + "학생의 총점은 " + total + "점입니다.");
	}
}

public class StudentTest {

	public static void main(String[] args) {

		Student2 studentLee = new Student2(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 95);
		
		Student2 studentKim = new Student2(101, "Kim");
		studentKim.setKoreaSubject("국어", 80);
		studentKim.setMathSubject("수학", 70);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}
}
