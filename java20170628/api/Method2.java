package java20170628.api;

public class Method2 {

	public String phone = "010-1234-5678";
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method2 instance = new Method2();
		System.out.println(instance.getPhone());
		
		Method1 instance2 = new Method1();
		instance2.setName("�ƹ���");
		System.out.println(instance2.getName());
		
		//Method2 �ȿ� ģ���� 2�ڸ� ������ get/set
		//Method1 �ȿ� ����, �ּ� get/set
		
		instance.setPhone("010-5678-1234");
		System.out.println(instance.getPhone());
		instance2.setName("ȫģ��");
		instance2.setAge(28);
		instance2.setAddress("�߱�");
		System.out.println(instance2.getName());
		System.out.println(instance2.getAge());
		System.out.println(instance2.getAddress());
	}

}
