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
		hash.setUserid("ȫ�浿");
		hash.setAge(10);
		hash.setAddress("����");
		array.add(hash);
		
		HashExample4 bean = (HashExample4)array.get(0);
		
		System.out.println(bean.getUserid());
		System.out.println(bean.getAge());
		System.out.println(bean.getAddress());
		System.out.println("==========================================================");
		//HashExample4 ���� ���� �����
		//�̸�, ����, �ּ� �Է��ϰ� �ٽ� ���
		//add, get ���
		
		hash.setUserid("�ƹ���");
		hash.setAge(14);
		hash.setAddress("�̱�");
		array.add(hash);
		
		bean = (HashExample4)array.get(1);
		
		System.out.println(bean.getUserid());
		System.out.println(bean.getAge());
		System.out.println(bean.getAddress());
		System.out.println("==========================================================");
		
		
		
	}

}
