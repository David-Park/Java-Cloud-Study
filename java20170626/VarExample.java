package java20170626;

public class VarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("����ȫ");
		System.out.println("it ���Ű��� ȯ���մϴ�.");
		
		//�ڱ��̸��� ���غ����� ...
		System.out.println("�� �̸��� " + name + "�Դϴ�.");
		
		//cafe.naver.com/javaclude203
		//�����Խ���
		//�̸�_�������ϸ�(Ŭ������)
		
		//variable : change-able thing
		//constant : non-change-able thing
		
		//�ڹٿ����� ������ �����ʿ��� �������� ����(value) �Ѿ��.
		
		String name2 = "ȫ�浿";
		
		
		System.out.print("�ڹٴ� ���ڿ��� ���� �� �ݵ�� String���� �޴´�.");
		System.out.println(name2);
		
		//����, �ּ�
		
		String age = new String("27");
		String address = new String("����� ������ �����");
		
		System.out.println(age);
		System.out.println(address);

		name2 = "�Ż��Ӵ�";
		
		System.out.println(name2);
		
		name2 = "���ڹ�";
		age = "27";
		address = "�ѱ�";
		
		System.out.println(name2);
		System.out.println(age);
		System.out.println(address);
		
		//����� ���� �ൿ�� ���ؼ� �ǻ������� �Ѵ�.
	}

}