package mysqljdbc;

public class StaticExample1 {

	//static : Ŭ������.������ or ��ü��, Ȥ�� �޼ҵ�
	//static �Ŵ� ���� non-static ���� ���� ���.
	//��� ��ü���� static���� ����, ��ü, �޼ҵ带 �����ϸ�
	//��� ��ü�� �ش��ϴ� static�� �����Ѵ�.
	
	public String name;
	public static  int statinit = 0;
	
	public StaticExample1(int intvalue){
		++statinit;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++){
			StaticExample1 stat = new StaticExample1(i);
			System.out.println(stat.statinit);
			}
		
	}

}
