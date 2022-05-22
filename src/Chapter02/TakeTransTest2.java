package Chapter02;

class Student4 {
	
	String studentName;
	int grade;
	int money;
	
	public Student4(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
}

class Taxi {
	String companyName;
	int money;
	
	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(companyName + "�ý� ������ " + money + "�� �Դϴ�.");
	}
}

public class TakeTransTest2 {
	public static void main(String[] args) {
		Student4 studentE = new Student4("Edward", 200000);
		
		Taxi taxi = new Taxi("�� ���� ���");
		studentE.takeTaxi(taxi);
	
		studentE.showInfo();
		taxi.showInfo();
	}
}










