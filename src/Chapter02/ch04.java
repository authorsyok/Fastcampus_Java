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
		studentLee.studentName = "ÀÌ¼ø½Å";
		studentLee.address = "¼­¿ï";
	
		studentLee.showUserInfo();
		
		Student studentKim = new Student();
		studentLee.studentName = "±èÅº";
		studentLee.address = "ºÎ»ê";
	
		studentLee.showUserInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
