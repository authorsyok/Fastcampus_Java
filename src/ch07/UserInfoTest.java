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
		return "고객님의 아이디는 " + userId + "이고, 이름은 " + userName + "입니다.";
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
