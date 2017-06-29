package java20170629;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class HashExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable hash = new Hashtable();
		// list : index 0부터 값을 담는다.
		// map은 (key,value) key를 기준으로 value값을 찾는다.
		// hash.put(key, value);

		// key, value 모두 Object 타입으로 들어간다.
		// 즉, 모든 타입으로 집어넣을수 있다.

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
		// 0~10까지 put 키는 자유
		// for 0~10까지 합을 구해서 출력

		hash.clear();

		for (int i = 0; i <= 10; i++)
			hash.put(i, i);
		int sum = 0;
		for (int i = 0; i <= 10; i++)
			sum += (int) hash.get(i);

		System.out.println(sum);
		System.out.println("==========================================================");

		hash.clear();

		hash.put("홍길동", "홍길동2");
		hash.put("아무개", "아무개2");
		hash.put("이순신", "이순신2");

		// 키가 String 타입이기 때문에 해당하는 키를 찾아서 출력한다.
		// String.valueOf(Object) Object를 담아서 String으로 강제 형변환 시킨다.
		String name = String.valueOf(hash.get("홍길동"));
		System.out.println(name);
		System.out.println("==========================================================");

		Enumeration en = hash.keys();

		while (en.hasMoreElements()) {
			String name2 = String.valueOf(en.nextElement());
			if (name2.equals("홍길동"))
				System.out.println("홍길동 입니다.");
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
