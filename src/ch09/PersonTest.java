package ch09;

class Person {
	String name;
	String gender;
	int age;
	int height;
	int weight;
	
	Person(){}
	
	void showPersonInfo() {
		System.out.println("키가 " + height + "이고, 몸무게가 " + weight + "킬로인 " + gender + "가 있다.");
		System.out.println("이름은 " + name + "이고, 나이느 " + age + "세입니다.");
	}
}

public class PersonTest {
	public static void main(String[] args) {
		
		Person personT = new Person();
		
		personT.name = "Tomas";
		personT.age = 37;
		personT.height = 180;
		personT.weight = 78;
		personT.gender = "남성";
		
		personT.showPersonInfo();
	}
}
