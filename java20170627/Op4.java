package java20170627;

public class Op4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = new String[10];

		for (int i = 0; i < str.length; i++) {
			str[i] = i + "";
			System.out.println(str[i]);
		}
		System.out.println("==========================================================================");
		
		//20���� ��(���ڿ�)
		//2~21 ���ڿ�
		//2~21���� ���ڿ� ���� ����ϼ���
		String str1[] = new String[20];
		
		for(int i=0;i<str1.length;i++)
		{
			str1[i] = i+2+"";
			System.out.println(str1[i]);
		}
		System.out.println("==========================================================================");
		
		//1~101 5,9,22,79,100�� �� 1�����迭�� 96�� ���� �����
		//¦�� �հ� Ȧ�� ���� ���� ���
		
		int intvalue[] = new int[96];
		int cnt = 1, evensum = 0, oddsum = 0;
		
		for(int i=0;i<intvalue.length;i++){
			if(cnt == 5 || cnt == 9 || cnt == 22 || cnt == 79 || cnt == 100)
				cnt++;
			intvalue[i] = cnt++;
		}
		
		for(int val : intvalue)
			if(val % 2 == 0)
				evensum+=val;
			else
				oddsum+=val;
		
		System.out.println("¦���� �� : " + evensum);
		System.out.println("Ȧ���� �� : " + oddsum);
		System.out.println("==========================================================================");

	}

}
