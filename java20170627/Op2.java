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
		//3~90 �� ���� ���Ͻð� ���
		
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

		//������ 2��...
		for(int i=1;i<10;i++)
			System.out.print("2x" + i + "=" + 2*i + "\t");
		System.out.println();
		System.out.println("================================================================");
		
		//������ 3��...
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
		
		//Ŭ������ �޼ҵ� ���� : ����� ���տ� ������ �빮��
		//�������� ������ �ҹ���
		//��Ű���� ������ �ҹ���
	}
}