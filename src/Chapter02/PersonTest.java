package Chapter02;

class Person {
	public String name;
	public int age;
	public int height;
	public int weight;
	public String gender;
	
	public void showPersonInfo() {
		System.out.println("Ű�� " + height + "�̰�, �����԰� " + weight + "ų���� " + gender + "�� �ֽ��ϴ�.");
		System.out.println("�̸��� " + name + "�̰�, ���̴� " + age + "�� �Դϴ�.");
	}
}

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.name = "Tomas";
		person.age = 36;
		person.height = 180;
		person.weight = 66;
		person.gender = "����";
		
		person.showPersonInfo();
	}

}
