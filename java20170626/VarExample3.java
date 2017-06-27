package java20170626;

public class VarExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "김현호선생님";
		System.out.println(name);
		
		//나이, 주소
		
		String age = "18";
		String address = "미국";
		
		String myaddress = name + " " + age + " " + address;
		System.out.println(myaddress);
		//나이를 정수형 나이로 바뀌고 10을 더해서
		//이름, 나이, 주소 말하세요
		
		int ages = 18;
		
		ages +=10;
		
		myaddress = name + " " + Integer.toString(ages) + " " + address;
		
		System.out.println(myaddress);
	}

}
