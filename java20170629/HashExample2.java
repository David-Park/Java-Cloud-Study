package java20170629;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class HashExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable hash = new Hashtable();
		// list : index 0���� ���� ��´�.
		// map�� (key,value) key�� �������� value���� ã�´�.
		// hash.put(key, value);

		// key, value ��� Object Ÿ������ ����.
		// ��, ��� Ÿ������ ��������� �ִ�.

		hash.put(0, 0);
		hash.put(1, 1);
		hash.put(2, 2);

		System.out.println(hash.get(0));
		System.out.println(hash.get(1));
		System.out.println(hash.get(2));
		System.out.println("==========================================================");

		for (int i = 0; i < hash.size(); i++)
			System.out.println((int) hash.get(i));

		System.out.println("==========================================================");
		// 0~10���� put Ű�� ����
		// for 0~10���� ���� ���ؼ� ���

		hash.clear();

		for (int i = 0; i <= 10; i++)
			hash.put(i, i);
		int sum = 0;
		for (int i = 0; i <= 10; i++)
			sum += (int) hash.get(i);

		System.out.println(sum);
		System.out.println("==========================================================");

		hash.clear();

		hash.put("ȫ�浿", "ȫ�浿2");
		hash.put("�ƹ���", "�ƹ���2");
		hash.put("�̼���", "�̼���2");

		// Ű�� String Ÿ���̱� ������ �ش��ϴ� Ű�� ã�Ƽ� ����Ѵ�.
		// String.valueOf(Object) Object�� ��Ƽ� String���� ���� ����ȯ ��Ų��.
		String name = String.valueOf(hash.get("ȫ�浿"));
		System.out.println(name);
		System.out.println("==========================================================");

		Enumeration en = hash.keys();

		while (en.hasMoreElements()) {
			String name2 = String.valueOf(en.nextElement());
			if (name2.equals("ȫ�浿"))
				System.out.println("ȫ�浿 �Դϴ�.");
		}
		System.out.println("==========================================================");
		
		
		Collection co = hash.values();
		Iterator it = co.iterator();
		while(it.hasNext()){
			System.out.println(String.valueOf(it.next()));
		}
		System.out.println("==========================================================");
		for(int i=0;i<co.toArray().length;i++)
			System.out.println(String.valueOf(co.toArray()[i]));
		
	}
}
