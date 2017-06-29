package java20170629;

import java.util.TreeMap;

public class ConstructorEx1 {
	public String name;
	public int age;
	public String address;
	public String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ConstructorEx1() {
		// TODO Auto-generated constructor stub
	}
	
	public ConstructorEx1(String name, int age, String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public ConstructorEx1(int age, String name, String address, String email) {
		// TODO Auto-generated constructor stub
		//this와 super는 맨앞에 와야한다.
		this(name, age, address);
		this.email = email;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
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
		ConstructorEx1 ex = new ConstructorEx1();
		ConstructorEx1 ex2 = new ConstructorEx1("홍길동", 10, "조선");
		
		//기본생성자 : ConstructorEx1();
		//기본생성자는 생략할 수 있다.
		//기본생성자 외에 아규먼트가 있는 생성자는 생략할 수 없다.
		
		System.out.println(ex2.getName());
		System.out.println(ex2.getAge());
		System.out.println(ex2.getAddress());
		
		//이메일 전역변수와 get을 만들고
		//생성자(나이, 이름, 주소, 이메일);
		//get 나이 주소 이름 이메일 출력
		System.out.println("==========================================================");
		ConstructorEx1 ex3 = new ConstructorEx1(14, "미국","아무개", "hello@world.com");
		
		System.out.println(ex3.getName());
		System.out.println(ex3.getAge());
		System.out.println(ex3.getAddress());
		System.out.println(ex3.getEmail());
		
		//abstract class => new 할 수 없다. 추상클래스
		//interface => 독립적으로 new 할 수 있다.
		//단 자식을 통해서 new 할 수 있다.
		//super 상속받은 부모클래스를 지칭하는 지시자.
		//this 자기 자신(class)을 지칭하는 지시자.
		//child 자식클래스를 지칭하는 지시자.
		System.out.println("==========================================================");
		
		TreeMap tree = new TreeMap();
		//ConstructorEx1을 TreeMap에 담고
		//다시 출력하시오.
		//get 이름 나이 주소 이메일 출력
		
		tree.put(0,ex3);
		ex = (ConstructorEx1)tree.get(0);
		
		System.out.println(ex.getName());
		System.out.println(ex.getAge());
		System.out.println(ex.getAddress());
		System.out.println(ex.getEmail());
		System.out.println("==========================================================");
		
	}

}
