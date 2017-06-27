package java20170627;

public class VarExample1 {

	public static void main(String[] args) {
		
		String name = "대립군";
		System.out.println("여기는 자바가 말하는 곳");
		String str = "여기는 자바가 말하는 곳";
		System.out.println(str);
		
		String carname = "람보르기니디아블로";
		
		int carspeedinit = 0;
		int carspeedup = 100;
		int carstop = 0;
		int carspeeddown = -40;
		
		System.out.println(carspeedinit + carspeedup + carspeeddown);
		
		String compare = "비교하는문자열";
		
		if("비교하는문자열".equals(compare))
			System.out.println("같은문자열입니다.");
		else
			System.out.println("다른문자열입니다.");
	}

}
