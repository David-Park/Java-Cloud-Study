package java20170627;

public class VarExample1 {

	public static void main(String[] args) {
		
		String name = "�븳��";
		System.out.println("����� �ڹٰ� ���ϴ� ��");
		String str = "����� �ڹٰ� ���ϴ� ��";
		System.out.println(str);
		
		String carname = "��������ϵ�ƺ��";
		
		int carspeedinit = 0;
		int carspeedup = 100;
		int carstop = 0;
		int carspeeddown = -40;
		
		System.out.println(carspeedinit + carspeedup + carspeeddown);
		
		String compare = "���ϴ¹��ڿ�";
		
		if("���ϴ¹��ڿ�".equals(compare))
			System.out.println("�������ڿ��Դϴ�.");
		else
			System.out.println("�ٸ����ڿ��Դϴ�.");
	}

}
