package java20170628.wrapp_string;

//import : java.lang�� �ڹ� ��Ű����
//�ڵ����� import �� �� �ִ�.(��������)
//������ java.lang ���� �ٸ� ��Ű���� ���� �� �� ����.

import java.lang.String;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class���� ������ api�� call �� �� ����
		//class������ api�� call �� �� �ִ�.
		
		String str = new String("123456789");
		String str2 = new String("ȫ�浿 20 ����");
		//int.new : ������ ������� �ؼ�
		//���������� ������ �� ����
		//int�� class�� �ƴ� ����� �̹Ƿ�
		//api�� ȣ�� �� �� ����.
		
		int intvalue = 10;
		Integer intvalue2 = new Integer(1);
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		
		if(str.equals("123456789"))
			System.out.println("����");
		else
			System.out.println("Ʋ����");
	
		System.out.println(str2.replaceAll("ȫ�浿", "�ƹ���"));
		System.out.println("==========================================================");
		
		String qu1 = new String("4567");
		
		for(int i=0;i<qu1.length();i++)
			System.out.print(qu1.charAt(i));
		System.out.println();
		qu1 = new String("������ Ʈ���� ������ ����");
		if(qu1.equals("Ʈ����"))
			System.out.println("����");
		else
			System.out.println("Ʋ����");
		
		qu1.replaceAll("Ʈ����","���ٸ�");
		System.out.println(qu1.toString());
	}

}
