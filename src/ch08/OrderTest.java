package ch08;

class Order {
	String orderNumber;
	String customerPhone;
	String customerAddress;
	String orderDate;
	String orderTime;
	int price;
	String menuId;
	
	Order(){}
	
	void showOrderDetail() {
		System.out.println("�ֹ� ���� ��ȣ: " + orderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ: " + customerPhone);
		System.out.println("�ֹ� �� �ּ�: " + customerAddress);
		System.out.println("�ֹ� ��¥: " + orderDate);
		System.out.println("�ֹ� �ð�: " + orderTime);
		System.out.println("�ֹ� ����: " + price);
		System.out.println("�޴� ��ȣ: " + menuId);
	}
	
}

public class OrderTest {
	public static void main(String[] args) {
		
		Order myOrder = new Order();
		myOrder.orderNumber = "202011020003";
		myOrder.customerPhone = "01023450001";
		myOrder.customerAddress = "����� ������ ���ﵿ 111-333";
		myOrder.orderDate = "20201102";
		myOrder.orderTime = "130258";
		myOrder.price = 35000;
		myOrder.menuId = "0003";
		
		myOrder.showOrderDetail();
	}
}
