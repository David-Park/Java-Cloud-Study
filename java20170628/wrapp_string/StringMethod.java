package java20170628.wrapp_string;

//import : java.lang은 자바 패키지로
//자동으로 import 할 수 있다.(생략가능)
//나머지 java.lang 외의 다른 패키지는 생략 할 수 없다.

import java.lang.String;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class에서 예약어는 api를 call 할 수 없고
		//class에서만 api를 call 할 수 있다.
		
		String str = new String("123456789");
		String str2 = new String("홍길동 20 조선");
		//int.new : 빨간색 예약어라고 해서
		//변수명으로 지정할 수 없고
		//int는 class가 아닌 예약어 이므로
		//api를 호출 할 수 없다.
		
		int intvalue = 10;
		Integer intvalue2 = new Integer(1);
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		
		if(str.equals("123456789"))
			System.out.println("같다");
		else
			System.out.println("틀리다");
	
		System.out.println(str2.replaceAll("홍길동", "아무개"));
		System.out.println("==========================================================");
		
		String qu1 = new String("4567");
		
		for(int i=0;i<qu1.length();i++)
			System.out.print(qu1.charAt(i));
		System.out.println();
		qu1 = new String("문재인 트럼프 만나러 간다");
		if(qu1.equals("트럼프"))
			System.out.println("같다");
		else
			System.out.println("틀리다");
		
		qu1.replaceAll("트럼프","오바마");
		System.out.println(qu1.toString());
	}

}
