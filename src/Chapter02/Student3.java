package Chapter02;

class Student3 {
	
	String studentName;
	int grade;
	int money;
	
	public Student3(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
}

class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "�� ������ �°��� " + passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
	}
}

class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "�� ����ö�� �°��� " + passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
	}
}

class TakeTransTest {

	public static void main(String[] args) {
		
		Student3 studentJ = new Student3("James", 5000);
		Student3 studentT = new Student3("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		
		Subway subwayGreen = new Subway(2);
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		
		studentJ.showInfo();
		studentT.showInfo();
	
		bus100.showBusInfo();
		subwayGreen.showSubwayInfo();
	}
}


