package ch09;

class Person {
	String name;
	String gender;
	int age;
	int height;
	int weight;
	
	Person(){}
	
	void showPersonInfo() {
		System.out.println("Ű�� " + height + "�̰�, �����԰� " + weight + "ų���� " + gender + "�� �ִ�.");
		System.out.println("�̸��� " + name + "�̰�, ���̴� " + age + "���Դϴ�.");
	}
}

public class PersonTest {
	public static void main(String[] args) {
		
		Person personT = new Person();
		
		personT.name = "Tomas";
		personT.age = 37;
		personT.height = 180;
		personT.weight = 78;
		personT.gender = "����";
		
		personT.showPersonInfo();
	}
}
