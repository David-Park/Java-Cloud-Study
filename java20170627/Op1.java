package java20170627;

public class Op1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String compare = "비교하는문자열";

		if ("비교하는문자열".equals(compare))
			System.out.println("같은문자열입니다.");
		else
			System.out.println("다른문자열입니다.");

		int one = 1;
		int two = 10;

		if (one > two)
			System.out.println("one two보다 크다");
		else
			System.out.println("one two보다 작다");

		switch (1) {
		case 1:
			System.out.println("1번을 선택");
			break;
		case 2:
			System.out.println("1번을 선택");
			break;
		case 3:
			System.out.println("1번을 선택");
			break;
		}
		System.out.println("================================================================");

		int init = 0;
		System.out.println(++init);
		System.out.println(init);
		System.out.println(init++);
		System.out.println(init);
		System.out.println(++init);
		System.out.println(init);
		System.out.println("================================================================");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("================================================================");

		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
		}
		System.out.println("================================================================");

		int intvalue1 = 1; int intvalue2 = 10;
		
		while(intvalue1++ < intvalue2)
		{
			System.out.println("참이면 실행 거짓이면 실행안함");
		}
		System.out.println("================================================================");

		intvalue1 = 1;
		
		do{
			System.out.println("참이면 실행 거짓이면 실행안함");
		}while(intvalue1++ < intvalue2);
		System.out.println("================================================================");

	}

}
