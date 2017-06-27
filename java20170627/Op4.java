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
		
		//20개의 방(문자열)
		//2~21 문자열
		//2~21까지 문자열 값을 출력하세요
		String str1[] = new String[20];
		
		for(int i=0;i<str1.length;i++)
		{
			str1[i] = i+2+"";
			System.out.println(str1[i]);
		}
		System.out.println("==========================================================================");
		
		//1~101 5,9,22,79,100을 뺀 1차원배열의 96개 방을 만들고
		//짝수 합과 홀수 합을 각각 출력
		
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
		
		System.out.println("짝수의 합 : " + evensum);
		System.out.println("홀수의 합 : " + oddsum);
		System.out.println("==========================================================================");

	}

}
