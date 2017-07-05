package java20170703;

import java.util.LinkedList;

public class DataExample1 {
	public String userid;
	public String passwd;
	public String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public DataExample1() {
		System.out.println("기본생성자");
	}

	public DataExample1(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}
	public DataExample1 (String userid, String passwd, String email)
	{
		this(userid, passwd);
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		System.out.println(name);
		System.out.println("===========================================");
		
		DataExample1 data = new DataExample1();
		DataExample1 data2 = new DataExample1("홍길동", "1234");

		data.setUserid("홍길동");
		System.out.println(data.getUserid());
		System.out.println("===========================================");
		
		System.out.println(data2.getUserid());
		System.out.println(data2.getPasswd());
		System.out.println("===========================================");
		
		LinkedList link = new LinkedList();
		link.add(data);
		DataExample1 data3 = (DataExample1)link.get(0);
		
		System.out.println(data3.getUserid());
		System.out.println("===========================================");
		
		//data2 : userid, passwd
		//data5 새로운 방에 userid, passwd, email 생성자
		//add(data5)
		//get
		
		DataExample1 data5 = new DataExample1("박명수", "5678", "hello@world.com");
		link.clear();
		
		link.add(data5);
		
		DataExample1 data6 = (DataExample1)link.get(0);
		System.out.println(data6.getUserid());
		System.out.println(data6.getPasswd());
		System.out.println(data6.getEmail());
		System.out.println("===========================================");
		
	}

}
