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
		System.out.println("주문접수번호: " + orderNumber);
		System.out.println("주문 핸드폰 번호: " + customerPhone);
		System.out.println("주문 집 주소: " + customerAddress);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문 시간: " + orderTime);
		System.out.println("주문 가격: " + price);
		System.out.println("메뉴번호: " + menuId);
	}
}

public class OrderTest {

	public static void main(String[] args) {
		
		Order myOrder = new Order();
		
		myOrder.orderNumber = "2013123";
		myOrder.customerPhone = "01012938126983";
		myOrder.customerAddress = "강남";
		myOrder.orderDate = "23432";
		myOrder.orderTime = "123214";
		myOrder.price = 34000;
		myOrder.menuId = "1111";
		
		myOrder.showOrderDetail();
		
	}

}
