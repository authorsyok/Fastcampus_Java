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
		return "고객님의 아이디는 " + userId + "이고, 등록된 이름은 " + userName + "입니다.";
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
