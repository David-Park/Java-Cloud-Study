package java20170629;

import java.util.Hashtable;

public class HashExample3 {

	public String userid;
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable en = new Hashtable();
		
		HashExample3 classex = new HashExample3();
		classex.setUserid("홍길동");
		en.put(0, classex);
		
		HashExample3 hashbean = (HashExample3)en.get(0);
		
		System.out.println(hashbean.getUserid());
		System.out.println("==========================================================");
		
		//모든 클래스는 반드시 Object를 상속받아야한다.(생략되어있음)
		//모든 클래스는 하나의 클래스만 상속 받을 수 있다.
		Object ob = new HashExample3();
		Object str = new String();
		Object intvalue = new Integer(1);
		System.out.println("==========================================================");
		
		//HashExample3 방 2개
		//첫번째 방 유저아이디 "아무개"
		//두번째 방 유저아이디 "문재인"
		//en.put(0,첫번째방)
		//en.put(1,두번째방)
		
		HashExample3 [] hashbean2 = new HashExample3[2];
		en.clear();
		for(int i=0;i<hashbean2.length;i++)
			hashbean2[i] = new HashExample3();
		
		hashbean2[0].setUserid("아무개");
		hashbean2[1].setUserid("문재인");
		
		for(int i=0;i<hashbean2.length;i++)
			en.put(i,hashbean2[i]);
		
		for(int i=0;i<en.size();i++)
			System.out.println(String.valueOf(((HashExample3)en.get(i)).getUserid()));
	}
}
