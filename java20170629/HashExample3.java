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
		classex.setUserid("ȫ�浿");
		en.put(0, classex);
		
		HashExample3 hashbean = (HashExample3)en.get(0);
		
		System.out.println(hashbean.getUserid());
		System.out.println("==========================================================");
		
		//��� Ŭ������ �ݵ�� Object�� ��ӹ޾ƾ��Ѵ�.(�����Ǿ�����)
		//��� Ŭ������ �ϳ��� Ŭ������ ��� ���� �� �ִ�.
		Object ob = new HashExample3();
		Object str = new String();
		Object intvalue = new Integer(1);
		System.out.println("==========================================================");
		
		//HashExample3 �� 2��
		//ù��° �� �������̵� "�ƹ���"
		//�ι�° �� �������̵� "������"
		//en.put(0,ù��°��)
		//en.put(1,�ι�°��)
		
		HashExample3 [] hashbean2 = new HashExample3[2];
		en.clear();
		for(int i=0;i<hashbean2.length;i++)
			hashbean2[i] = new HashExample3();
		
		hashbean2[0].setUserid("�ƹ���");
		hashbean2[1].setUserid("������");
		
		for(int i=0;i<hashbean2.length;i++)
			en.put(i,hashbean2[i]);
		
		for(int i=0;i<en.size();i++)
			System.out.println(String.valueOf(((HashExample3)en.get(i)).getUserid()));
	}
}
