package java20170626;

public class VarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("박재홍");
		System.out.println("it 오신것을 환영합니다.");
		
		//자기이름을 말해보세여 ...
		System.out.println("제 이름은 " + name + "입니다.");
		
		//cafe.naver.com/javaclude203
		//문제게시판
		//이름_현재파일명(클래스명)
		
		//variable : change-able thing
		//constant : non-change-able thing
		
		//자바에서의 변수는 오른쪽에서 왼쪽으로 값이(value) 넘어간다.
		
		String name2 = "홍길동";
		
		
		System.out.print("자바는 문자열을 받을 때 반드시 String으로 받는다.");
		System.out.println(name2);
		
		//나이, 주소
		
		String age = new String("27");
		String address = new String("서울시 강서구 블라블라");
		
		System.out.println(age);
		System.out.println(address);

		name2 = "신사임당";
		
		System.out.println(name2);
		
		name2 = "김자바";
		age = "27";
		address = "한국";
		
		System.out.println(name2);
		System.out.println(age);
		System.out.println(address);
		
		//사람은 말과 행동을 통해서 의사전달을 한다.
	}

}