package java20170627;

public class Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalresult = 0;
		for (int i = 1; i <= 10; i++) {
			totalresult += i;
			System.out.println(totalresult);
		}
		System.out.println("================================================================");
		//3~90 의 합을 구하시고 출력
		
		totalresult = 0;
		for (int i = 3; i <= 90; i++)
			totalresult += i;
		System.out.println(totalresult);
		System.out.println("================================================================");
		totalresult = 0;
		int j=2;
		while(j++ < 90)
			totalresult += j;
		System.out.println(totalresult);
		System.out.println("================================================================");
		totalresult = 0;
		j=3;
		do{
			totalresult += j;
		}while(j++<90);
		System.out.println(totalresult);
		System.out.println("================================================================");
		
		//2x1=2 2x2=4
		System.out.print("2x1=" + 2*1 + "\t");
		System.out.print("2x2=" + 2*2 + "\t");
		System.out.print("2x3=" + 2*3 + "\t");
		System.out.print("2x4=" + 2*4 + "\t");
		System.out.print("...." + "\t");
		System.out.println("2x9=" + 2*9);
		System.out.println("================================================================");

		//구구단 2단...
		for(int i=1;i<10;i++)
			System.out.print("2x" + i + "=" + 2*i + "\t");
		System.out.println();
		System.out.println("================================================================");
		
		//구구단 3단...
		for(int i=1;i<10;i++)
			System.out.println("3x" + i + "=" + 3*i);
		System.out.println("================================================================");
		
		j=0;
		while(++j<=9)
			System.out.print("2x" + j + "=" + 2*j + "\t");
		System.out.println();
		System.out.println("================================================================");
		
		j=1;
		do{
			System.out.print("2x" + j + "=" + 2*j + "\t");
		}while(++j<=9);
		System.out.println();
		System.out.println("================================================================");
		
		//클래스나 메소드 변수 : 명사명사 명사앞에 무조건 대문자
		//변수명은 무조건 소문자
		//패키지명도 무조건 소문자
	}
}