package Chapter02;

class Student {
	public int studentId;
	public String studentName;
	public String address;
	
	public void showUserInfo() {
		System.out.println(studentName + " " + address);
	}
}

public class ch04 {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "����";
	
		studentLee.showUserInfo();
		
		Student studentKim = new Student();
		studentLee.studentName = "��ź";
		studentLee.address = "�λ�";
	
		studentLee.showUserInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
