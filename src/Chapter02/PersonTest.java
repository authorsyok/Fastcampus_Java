package Chapter02;

class Person {
	public String name;
	public int age;
	public int height;
	public int weight;
	public String gender;
	
	public void showPersonInfo() {
		System.out.println("키가 " + height + "이고, 몸무게가 " + weight + "킬로인 " + gender + "이 있습니다.");
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "세 입니다.");
	}
}

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.name = "Tomas";
		person.age = 36;
		person.height = 180;
		person.weight = 66;
		person.gender = "남성";
		
		person.showPersonInfo();
	}

}
