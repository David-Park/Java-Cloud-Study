package java20170703;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList : �迭��ſ� ���� list -> �ӵ��� ������ �޸� �������� ����
		//Vector : �迭��ſ� ���� list -> �ӵ��� ������ �޸� �������� ����
		//HashTable : key(Object), value(Object)
		//list�� ���� �� 0��°(index)���� ��´�
		//list add(int,Object) -> 0��°���� ��� ������ int type 
		Vector ve = new Vector();
		
		ve.add(0, 0);
		Integer.parseInt(String.valueOf(ve.get(0)));
		for(int i=0;i<ve.size();i++)
			System.out.println(ve.get(i));
		System.out.println("==========================================================");
		
		ve.clear();
		ve.add("ȫ�浿");
		System.out.println(String.valueOf(ve.get(0)));
		System.out.println("==========================================================");
		
		ve.clear();
		ve.add("ȫ�浿");
		ve.add("�ƹ���");
		ve.add("��ģ��");
		
		for(int i=0;i<ve.size();i++)
			System.out.println(String.valueOf(ve.get(i)));
		System.out.println("==========================================================");
		
		Enumeration en = ve.elements();
		while(en.hasMoreElements())
			System.out.println(en.nextElement());
		System.out.println("==========================================================");
		
		for(Iterator i = ve.listIterator();i.hasNext();)
			System.out.println(String.valueOf(i.next()));
		System.out.println("==========================================================");
		
	}

}
