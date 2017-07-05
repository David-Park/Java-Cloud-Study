package java20170703;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList : 배열대신에 쓰는 list -> 속도가 빠르고 메모리 점유율이 낮다
		//Vector : 배열대신에 쓰는 list -> 속도가 느리고 메모리 점유율이 많다
		//HashTable : key(Object), value(Object)
		//list는 담을 때 0번째(index)부터 담는다
		//list add(int,Object) -> 0번째부터 담기 때문에 int type 
		Vector ve = new Vector();
		
		ve.add(0, 0);
		Integer.parseInt(String.valueOf(ve.get(0)));
		for(int i=0;i<ve.size();i++)
			System.out.println(ve.get(i));
		System.out.println("==========================================================");
		
		ve.clear();
		ve.add("홍길동");
		System.out.println(String.valueOf(ve.get(0)));
		System.out.println("==========================================================");
		
		ve.clear();
		ve.add("홍길동");
		ve.add("아무개");
		ve.add("김친구");
		
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
