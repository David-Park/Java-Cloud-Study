package java20170628.api;

public class Method1 {
	// ��������: ���������� �ܺο��� ������ �� �ִ�
	// ���������� �ʱ�ȭ ���ص� �ȴ�
	// ���������� ����������(public, protected, private, default)�� ���� ���ص� �ȴ�

	private String name = "ȫ�浿";
	private int age = 10;
	private String address = "����";
	
	//alt+shift+s
	//ctrl+shift+f : �ڵ�����
	//ctrl+shift+c : �ּ��̳� �ּ� ����
	
	//�޼ҵ� ���� ����
	//���������� ����Ÿ�� �޼ҵ�� (���ڰ�){}
	//�޼ҵ�: �޼ҵ�� �ݵ�� ()�� �־���Ѵ�
	//�޼ҵ�� ��ȯ���� ���� Ÿ���� void
	//�ִ� Ÿ���� �ش� ����Ÿ������ ���Ѵ�
	//���ڰ��� ���� �޼ҵ�� �⺻�޼ҵ��� �ϰ�, ���ڰ��� ������ �������� �� �� �ִ�.
	//set, get�� �ش��ϴ� �������� ���� �� �޼ҵ带 �θ���(call) ������ return�Ѵ�
	//set, get, add : ��� ���� ����, �Է�, ���� �� ��
	
	//�޼ҵ�� ȥ�ڼ� ���� ���Ѵ�
	//JVM(Java Virtual Machine)�� main �޼ҵ带 ����(call)�Ѵ�
	//�޼ҵ�� �ݵ�� �׼��� ���Ѵ�
	//�޼ҵ�� �������� ���������� ��ų� ���� ��´�
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		//this ������ : �� Ŭ������ ��������� ����Ű�� ���� �����
		
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

		// �ڹٴ� call by value : �ڹٴ� �޸𸮷� ������ ����
		// ���� ���� �� ���� value������ ������

		// c�� call by reference : �޸� ������ ����Ų��

		// ������ �ϳ��� Ÿ�Ը� �޴´�
		// ������ ��ȣ�� ����
		// ���������� ��ȣ�ȿ� �ִ� ������
		// ���������� �ܺο��� ������ �� ����
		// ���������� �ݵ�� �ʱ�ȭ ���Ѿ��Ѵ�

		
		//���ѹα�.����.��õ��.���굿.��������к���5��2��.203ȣ
		//ū ������ ���� ���� ���ϴ�.(Object)
		
		
		String name = "�ʱ�ȭ";
		System.out.println(name);
		
		//������ ���ο� Ÿ���� ����
		Method1 instance = new Method1();
		
		System.out.println(instance.getName());
		//�������� ����, �ּ� ���
		//ģ�� ����, �ּ� �ٽ� �Է�
		
		System.out.println(instance.getAge());
		System.out.println(instance.getAddress());
		System.out.println("==========================================================");
		instance.setName("ȫ����");
		instance.setAge(27);
		instance.setAddress("�̱�");

		System.out.println(instance.getName());
		System.out.println(instance.getAge());
		System.out.println(instance.getAddress());
		
		//���������� ���� ���� �ٰų� ���� �� ����(����������)
		//get/set �޼ҵ带 Ȱ���� ���������� �����Ͽ� ���� ��ų� ���� ����
		
	}

}
