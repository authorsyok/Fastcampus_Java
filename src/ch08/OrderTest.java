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
		System.out.println("주문 접수 번호: " + orderNumber);
		System.out.println("주문 핸드폰 번호: " + customerPhone);
		System.out.println("주문 집 주소: " + customerAddress);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문 시간: " + orderTime);
		System.out.println("주문 가격: " + price);
		System.out.println("메뉴 번호: " + menuId);
	}
	
}

public class OrderTest {
	public static void main(String[] args) {
		
		Order myOrder = new Order();
		myOrder.orderNumber = "202011020003";
		myOrder.customerPhone = "01023450001";
		myOrder.customerAddress = "서울시 강남구 역삼동 111-333";
		myOrder.orderDate = "20201102";
		myOrder.orderTime = "130258";
		myOrder.price = 35000;
		myOrder.menuId = "0003";
		
		myOrder.showOrderDetail();
	}
}
