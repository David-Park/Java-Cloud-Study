package java20170626;

public class VarExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "����ȣ������";
		System.out.println(name);
		
		//����, �ּ�
		
		String age = "18";
		String address = "�̱�";
		
		String myaddress = name + " " + age + " " + address;
		System.out.println(myaddress);
		//���̸� ������ ���̷� �ٲ�� 10�� ���ؼ�
		//�̸�, ����, �ּ� ���ϼ���
		
		int ages = 18;
		
		ages +=10;
		
		myaddress = name + " " + Integer.toString(ages) + " " + address;
		
		System.out.println(myaddress);
	}

}
