package Chapter02;

class userInfo {
	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	public userInfo() {}
	
	public userInfo(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	
	public String showUserInfo() {
		return "������ ���̵�� " + userId + "�̰�, ��ϵ� �̸��� " + userName + "�Դϴ�.";
	}
	
}

public class ch07 {

	public static void main(String[] args) {
		
		userInfo userLee = new userInfo();
		
		userLee.userId = "a12345";
		userLee.userPassword = "zscxasdqwe";
		userLee.userName = "Lee";
		userLee.phoneNumber = "01012345678";
		userLee.userAddress = "Seoul";
		
		System.out.println(userLee.showUserInfo());
	}

}
