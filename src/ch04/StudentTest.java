package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		Student studentKim = new Student();
		
		studentLee.studentId = 12345;
		studentKim.studentId = 54321;
		
		//setStudentName�� �ص��ǰ� studentName�� �ᵵ ��
		studentLee.setStudentName("Lee");
		studentLee.address = "�λ�";
		studentKim.setStudentName("Kim");
		studentKim.address = "����";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}

}
