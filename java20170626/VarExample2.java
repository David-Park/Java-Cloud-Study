package java20170626;

public class VarExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ������
		int intvalue = 10;
		
		//���ڿ��� String
		//�������� int
		
		System.out.println(intvalue);
		
		//������ ������ ���� ������ 10 ���ؼ� ���� �غ�����.
		
		
		System.out.println(intvalue + 10);
		
		int age = 10;
		//���̰� 20�� �� �����.(20���� �귶��).
		
		age+=20;
		
		System.out.println(age);
		
		int carspeed = 0;
		
		int carspeedup = 100;
		
		int breakvalue = 0;
		
		//�ڵ����� �õ��� �ɾ���.
		
		//���� ���ǵ�� 0�̴�.
		System.out.println(carspeed);
		
		//������� �����ϰ� 100���� �޸���.
		carspeed += carspeedup;
		System.out.println(carspeed);
		
		//�߰��� ��� �ӵ��� ���δ� -30;
		int carspeeddown = -30;
		carspeed +=carspeeddown;
		System.out.println(carspeed);
		
		//�ٽ� ������ �Ѵ� 40;
		carspeedup = 40;
		carspeed += carspeedup;
		System.out.println(carspeed);
		
		
	}

}