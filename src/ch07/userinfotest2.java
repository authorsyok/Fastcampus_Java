package ch07;

class userinfo2{
	String userid;
	String username;
	
	userinfo2(){}
	
	userinfo2(String id, String name) {
		this.userid = id;
		this.username = name;
	}
	
	String showuserinfo() {
		return "고객님이 아이디는 " + userid + "이고, 이름은 " + username + "입니다.";
	}
}

public class userinfotest2 {
	public static void main(String[] args) {
		
		userinfo2 userlee = new userinfo2();
		userlee.userid = "adawdawd";
		userlee.username = "lee";
		System.out.println(userlee.showuserinfo());
		
		userinfo2 userkim = new userinfo2("wedwedwe", "kim");
		System.out.println(userkim.showuserinfo());
	}
}
