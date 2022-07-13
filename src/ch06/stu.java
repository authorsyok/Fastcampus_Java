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
		return name + "학생의 넘버는 " + number + "이고, " + grade + "학년이다.";
	}
}

public class stu {
	public static void main(String[] args) {
		
		stud student = new stud("kpe", 12345, 3);
		
		String data = student.showInfo();
		System.out.println(data);
	}
}
