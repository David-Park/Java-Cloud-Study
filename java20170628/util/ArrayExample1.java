package java20170628.util;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList array = new ArrayList();
		//ctrl+shift+o : �ڵ� import
		//add: list�� ���� ��� Ŭ���� ���� ������ �ε��� 0���� ���� ��´�
		//add(int index, Object value);
		//Object:��� Ÿ���� ���� �� �ִ�.
		//��� Ÿ���� Object�� ���Եȴ�.
		
		//element : ��� �ϳ�
		array.add(0,0);
		
		//downcasting(���� ����ȯ)
		//Object������(��� ������Ÿ��) ������ Ÿ������ ��ȯ
		int intvalue = (int)array.get(0);
		System.out.println(array.get(0).getClass().getName());
		System.out.println(intvalue+1);
		System.out.println("==========================================================");
		
		//�ʱ�ȭ
		array.clear();
		
		array.add(0,1);
		array.add(1,2);
		//0��° �� ���������� �ٲٰ� ���
		//1��° �� ���������� �ٲٰ� ���
		//0��°�� 1��°�� ���� +1 ���� �ٽ� ���
		
		System.out.println((int)array.get(0));
		System.out.println((int)array.get(1));
		System.out.println("==========================================================");
		
		array.set(0,(int)array.get(0)+1);
		array.set(1, (int)array.get(1)+1);
		System.out.println((int)array.get(0));
		System.out.println((int)array.get(1));
		System.out.println("==========================================================");
		
		int sum = 0;
		array.clear();
		//1~10 ���� add�ϰ�, get���� ���� ���� ���Ͻÿ�
		for(int i=0;i<10;i++)
		{
				array.add(i,i+1);
				sum += (int)array.get(i);
		}
		System.out.println(sum);
		System.out.println("==========================================================");
		  
		LinkedList<Integer> link = new LinkedList<Integer>();
		
		//2~100 ���� ���Ͻð� ���
		//add, get
		//���� �����Խ���
		
		int addsum = 0;
		for(int i=2;i<=100;i++)
		{
			link.add(i);
			addsum+= link.get(i-2);
		}
		
		System.out.println(addsum);
	}

}
