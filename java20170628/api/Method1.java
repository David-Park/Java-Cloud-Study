package java20170628.api;

public class Method1 {
	// 전역변수: 전역변수는 외부에서 접근할 수 있다
	// 전역변수는 초기화 안해도 된다
	// 전역변수는 접근제한자(public, protected, private, default)로 선언 안해도 된다

	private String name = "홍길동";
	private int age = 10;
	private String address = "조선";
	
	//alt+shift+s
	//ctrl+shift+f : 자동정렬
	//ctrl+shift+c : 주석이나 주석 해제
	
	//메소드 정의 순서
	//접근제한자 리턴타입 메소드명 (인자값){}
	//메소드: 메소드는 반드시 ()가 있어야한다
	//메소드는 반환형이 없는 타입은 void
	//있는 타입은 해당 리턴타입으로 정한다
	//인자값이 없는 메소드는 기본메소드라고 하고, 인자값의 갯수는 무한으로 올 수 있다.
	//set, get은 해당하는 변수에서 값을 얻어서 메소드를 부르는(call) 곳으로 return한다
	//set, get, add : 모든 값을 설정, 입력, 수정 할 때
	
	//메소드는 혼자서 실행 못한다
	//JVM(Java Virtual Machine)이 main 메소드를 실행(call)한다
	//메소드는 반드시 액션을 취한다
	//메소드로 움직여서 전역변수에 담거나 값을 얻는다
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		//this 지시자 : 현 클래스의 멤버변수를 가리키기 위해 사용함
		
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자바는 call by value : 자바는 메모리로 접근을 안함
		// 값을 던질 때 실제 value값으로 던진다

		// c는 call by reference : 메모리 번지를 가리킨다

		// 변수는 하나의 타입만 받는다
		// 변수는 괄호가 없다
		// 지역변수는 괄호안에 있는 변수로
		// 지역변수는 외부에서 접근할 수 없다
		// 지역변수는 반드시 초기화 시켜야한다

		
		//대한민국.서울.금천구.가산동.벽산디지털벨리5차2층.203호
		//큰 데에서 작은 데로 갑니다.(Object)
		
		
		String name = "초기화";
		System.out.println(name);
		
		//무조건 새로운 타입을 생성
		Method1 instance = new Method1();
		
		System.out.println(instance.getName());
		//전역변수 나이, 주소 출력
		//친구 나이, 주소 다시 입력
		
		System.out.println(instance.getAge());
		System.out.println(instance.getAddress());
		System.out.println("==========================================================");
		instance.setName("홍일점");
		instance.setAge(27);
		instance.setAddress("미국");

		System.out.println(instance.getName());
		System.out.println(instance.getAge());
		System.out.println(instance.getAddress());
		
		//전역변수에 직접 값을 다거나 얻을 수 없다(접근제한자)
		//get/set 메소드를 활용해 전역변수에 접근하여 값을 얻거나 변경 가능
		
	}

}
