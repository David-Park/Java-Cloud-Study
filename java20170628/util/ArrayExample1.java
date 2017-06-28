package java20170628.util;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList array = new ArrayList();
		//ctrl+shift+o : 자동 import
		//add: list로 가는 모든 클래스 명은 무조건 인덱스 0부터 값을 담는다
		//add(int index, Object value);
		//Object:모든 타입을 가질 수 있다.
		//모든 타입이 Object에 포함된다.
		
		//element : 요소 하나
		array.add(0,0);
		
		//downcasting(강제 형변환)
		//Object형에서(모든 데이터타입) 정수형 타입으로 변환
		int intvalue = (int)array.get(0);
		System.out.println(array.get(0).getClass().getName());
		System.out.println(intvalue+1);
		System.out.println("==========================================================");
		
		//초기화
		array.clear();
		
		array.add(0,1);
		array.add(1,2);
		//0번째 값 정수형으로 바꾸고 출력
		//1번째 값 정수형으로 바꾸고 출력
		//0번째와 1번째에 각각 +1 이후 다시 출력
		
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
		//1~10 값을 add하고, get으로 빼고 합을 구하시오
		for(int i=0;i<10;i++)
		{
				array.add(i,i+1);
				sum += (int)array.get(i);
		}
		System.out.println(sum);
		System.out.println("==========================================================");
		  
		LinkedList<Integer> link = new LinkedList<Integer>();
		
		//2~100 합을 더하시고 출력
		//add, get
		//일일 문제게시판
		
		int addsum = 0;
		for(int i=2;i<=100;i++)
		{
			link.add(i);
			addsum+= link.get(i-2);
		}
		
		System.out.println(addsum);
	}

}
