package Chapter02;

class Studentt {
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Studentt(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName + "�л��� �й��� " + studentNumber + "�̰�, " +grade + "�г��̴�.";
	}
}

public class ch06 {

	public static void main(String[] args) {
		
		Studentt studentLee = new Studentt(12345, "Lee", 3);
		
		String data = studentLee.showStudentInfo();
		System.out.println(data);
	}
}
