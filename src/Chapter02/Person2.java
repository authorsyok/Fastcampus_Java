package Chapter02;

public class Person2 {
	
	String name;
	int age;
	
	public Person2() {
		this("이름없음", 1);
	}
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person2 getPerson() {
		return this;
	}

	public static void main(String[] args) {
		
		Person2 p = new Person2();
		
		p.name = "James";
		p.age = 38;
		
		Person2 p2 = p.getPerson();
		System.out.println(p);
		System.out.println(p2);
	}

}
