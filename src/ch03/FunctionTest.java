package ch03;

public class FunctionTest {

	// ��ȯ���� �ְ� �Ű������� �ִ� ��
	public static int addNum(int num1, int num2) {
		return num1 + num2;
	}
	
	// ��ȯ���� ���� ��쿡�� void�� ����ض�
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	// ��ȯ�� �ϴµ� �Ű������� ����
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
		
		sayHello("�ȳ��ϼ���");
		
		int total = calc();
		System.out.println(total);
	}

}
