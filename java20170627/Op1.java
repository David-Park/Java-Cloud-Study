package java20170627;

public class Op1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String compare = "���ϴ¹��ڿ�";

		if ("���ϴ¹��ڿ�".equals(compare))
			System.out.println("�������ڿ��Դϴ�.");
		else
			System.out.println("�ٸ����ڿ��Դϴ�.");

		int one = 1;
		int two = 10;

		if (one > two)
			System.out.println("one two���� ũ��");
		else
			System.out.println("one two���� �۴�");

		switch (1) {
		case 1:
			System.out.println("1���� ����");
			break;
		case 2:
			System.out.println("1���� ����");
			break;
		case 3:
			System.out.println("1���� ����");
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
			System.out.println("���̸� ���� �����̸� �������");
		}
		System.out.println("================================================================");

		intvalue1 = 1;
		
		do{
			System.out.println("���̸� ���� �����̸� �������");
		}while(intvalue1++ < intvalue2);
		System.out.println("================================================================");

	}

}
