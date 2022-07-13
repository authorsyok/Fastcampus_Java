package ch07;

class UserInfo {
	String userId;
	String userPassword;
	String userName;
	String phoneNumber;
	String userAddress;
	
	UserInfo(){}
	
	UserInfo(String userId, String userName) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
	}
	
	String showUserInfo() {
		return "������ ���̵�� " + userId + "�̰�, �̸��� " + userName + "�Դϴ�.";
	}
}

public class UserInfoTest {
	public static void main(String[] args) {
		
		UserInfo userLee = new UserInfo();
		userLee.userId = "a12345";
		userLee.userPassword = "sv132r";
		userLee.userName = "Lee";
		userLee.phoneNumber = "awdawdw";
		userLee.userAddress = "adawdaw";
		
		System.out.println(userLee.showUserInfo());
		
		UserInfo userKim = new UserInfo("adawda", "Kim");
		System.out.println(userKim.showUserInfo());
	}
}
