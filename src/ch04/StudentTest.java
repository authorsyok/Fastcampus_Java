package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		Student studentKim = new Student();
		
		studentLee.studentId = 12345;
		studentKim.studentId = 54321;
		
		//setStudentName을 해도되고 studentName을 써도 됨
		studentLee.setStudentName("Lee");
		studentLee.address = "부산";
		studentKim.setStudentName("Kim");
		studentKim.address = "서울";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}

}
