package Chapter02;

class Order {
	public String orderNumber;
	public String customerPhone;
	public String customerAddress;
	public String orderDate;
	public String orderTime;
	public int price;
	public String menuId;
	
	public void showOrderDetail() {
		System.out.println("�ֹ�������ȣ: " + orderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ: " + customerPhone);
		System.out.println("�ֹ� �� �ּ�: " + customerAddress);
		System.out.println("�ֹ� ��¥: " + orderDate);
		System.out.println("�ֹ� �ð�: " + orderTime);
		System.out.println("�ֹ� ����: " + price);
		System.out.println("�޴���ȣ: " + menuId);
	}
}

public class OrderTest {

	public static void main(String[] args) {
		
		Order myOrder = new Order();
		
		myOrder.orderNumber = "2013123";
		myOrder.customerPhone = "01012938126983";
		myOrder.customerAddress = "����";
		myOrder.orderDate = "23432";
		myOrder.orderTime = "123214";
		myOrder.price = 34000;
		myOrder.menuId = "1111";
		
		myOrder.showOrderDetail();
		
	}

}
