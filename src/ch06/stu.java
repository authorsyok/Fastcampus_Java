package ch06;

class stud {
	String name;
	int number;
	int grade;
	
	stud(String name, int number, int grade) {
		this.name = name;
		this.number = number;
		this.grade = grade;
	}
	
	String showInfo() {
		return name + "�л��� �ѹ��� " + number + "�̰�, " + grade + "�г��̴�.";
	}
}

public class stu {
	public static void main(String[] args) {
		
		stud student = new stud("kpe", 12345, 3);
		
		String data = student.showInfo();
		System.out.println(data);
	}
}
