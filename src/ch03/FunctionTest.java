package ch03;

public class FunctionTest {

	// 반환값도 있고 매개변수도 있는 것
	public static int addNum(int num1, int num2) {
		return num1 + num2;
	}
	
	// 반환값이 없는 경우에는 void를 사용해라
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	// 반환은 하는데 매개변수가 없는
	public static int calc() {
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int result = addNum(n1, n2);
		System.out.println(result);
		
		sayHello("안녕하세요");
		
		int total = calc();
		System.out.println(total);
	}

}
