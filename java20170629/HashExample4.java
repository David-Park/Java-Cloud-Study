package java20170629;

import java.util.ArrayList;

public class HashExample4 {

	public String address;
	public String userid;
	public int age;
	
	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashExample4 hash = new HashExample4();
		ArrayList array = new ArrayList();
		hash.setUserid("홍길동");
		hash.setAge(10);
		hash.setAddress("조선");
		array.add(hash);
		
		HashExample4 bean = (HashExample4)array.get(0);
		
		System.out.println(bean.getUserid());
		System.out.println(bean.getAge());
		System.out.println(bean.getAddress());
		System.out.println("==========================================================");
		//HashExample4 방을 새로 만들고
		//이름, 나이, 주소 입력하고 다시 출력
		//add, get 사용
		
		hash.setUserid("아무개");
		hash.setAge(14);
		hash.setAddress("미국");
		array.add(hash);
		
		bean = (HashExample4)array.get(1);
		
		System.out.println(bean.getUserid());
		System.out.println(bean.getAge());
		System.out.println(bean.getAddress());
		System.out.println("==========================================================");
		
		
		
	}

}
