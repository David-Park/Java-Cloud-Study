package java20170626;

public class VarExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//숫자 정수형
		int intvalue = 10;
		
		//문자열은 String
		//정수형은 int
		
		System.out.println(intvalue);
		
		//정수형 변수에 숫자 정수형 10 더해서 말을 해보세요.
		
		
		System.out.println(intvalue + 10);
		
		int age = 10;
		//나이가 20을 더 들었다.(20년이 흘렀다).
		
		age+=20;
		
		System.out.println(age);
		
		int carspeed = 0;
		
		int carspeedup = 100;
		
		int breakvalue = 0;
		
		//자동차에 시동을 걸었다.
		
		//현재 스피드는 0이다.
		System.out.println(carspeed);
		
		//가속페달 가속하고 100으로 달린다.
		carspeed += carspeedup;
		System.out.println(carspeed);
		
		//중간에 잠시 속도를 줄인다 -30;
		int carspeeddown = -30;
		carspeed +=carspeeddown;
		System.out.println(carspeed);
		
		//다시 가속을 한다 40;
		carspeedup = 40;
		carspeed += carspeedup;
		System.out.println(carspeed);
		
		
	}

}