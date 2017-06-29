package java20170629;

import java.util.TreeMap;

public class ConstructorEx1 {
	public String name;
	public int age;
	public String address;
	public String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ConstructorEx1() {
		// TODO Auto-generated constructor stub
	}
	
	public ConstructorEx1(String name, int age, String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public ConstructorEx1(int age, String name, String address, String email) {
		// TODO Auto-generated constructor stub
		//this�� super�� �Ǿտ� �;��Ѵ�.
		this(name, age, address);
		this.email = email;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
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
		ConstructorEx1 ex = new ConstructorEx1();
		ConstructorEx1 ex2 = new ConstructorEx1("ȫ�浿", 10, "����");
		
		//�⺻������ : ConstructorEx1();
		//�⺻�����ڴ� ������ �� �ִ�.
		//�⺻������ �ܿ� �ƱԸ�Ʈ�� �ִ� �����ڴ� ������ �� ����.
		
		System.out.println(ex2.getName());
		System.out.println(ex2.getAge());
		System.out.println(ex2.getAddress());
		
		//�̸��� ���������� get�� �����
		//������(����, �̸�, �ּ�, �̸���);
		//get ���� �ּ� �̸� �̸��� ���
		System.out.println("==========================================================");
		ConstructorEx1 ex3 = new ConstructorEx1(14, "�̱�","�ƹ���", "hello@world.com");
		
		System.out.println(ex3.getName());
		System.out.println(ex3.getAge());
		System.out.println(ex3.getAddress());
		System.out.println(ex3.getEmail());
		
		//abstract class => new �� �� ����. �߻�Ŭ����
		//interface => ���������� new �� �� �ִ�.
		//�� �ڽ��� ���ؼ� new �� �� �ִ�.
		//super ��ӹ��� �θ�Ŭ������ ��Ī�ϴ� ������.
		//this �ڱ� �ڽ�(class)�� ��Ī�ϴ� ������.
		//child �ڽ�Ŭ������ ��Ī�ϴ� ������.
		System.out.println("==========================================================");
		
		TreeMap tree = new TreeMap();
		//ConstructorEx1�� TreeMap�� ���
		//�ٽ� ����Ͻÿ�.
		//get �̸� ���� �ּ� �̸��� ���
		
		tree.put(0,ex3);
		ex = (ConstructorEx1)tree.get(0);
		
		System.out.println(ex.getName());
		System.out.println(ex.getAge());
		System.out.println(ex.getAddress());
		System.out.println(ex.getEmail());
		System.out.println("==========================================================");
		
	}

}
