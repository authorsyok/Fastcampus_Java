package Chapter02;

class BirthDay {
	private int day; 
	private int month;
	private int year;
	
	private boolean isValid;
	
	public void setDay(int day) {
		this.day = day; 
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		
		if ( month < 1 || month > 12) {
			isValid = false;
		}
		else {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		
		if ( isValid) {
			System.out.println( year + "�� " + month + "�� " + day + "�� �Դϴ�."  );
		}
		else {
			System.out.println("��ȿ���� ���� ��¥ �Դϴ�");
		}
	}
}

public class BirthdayTest {

	public static void main(String[] args) {
		BirthDay date = new BirthDay();
		
		date.setYear(2019);
		date.setMonth(77);
		date.setDay(100);
		
		date.showDate();
		
		
	}

}