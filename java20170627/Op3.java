package java20170627;

public class Op3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//10개의 정수형 방
		//0부터 9까지
		//배열은 0부터 인덱스를 시작한다
		//배열은 0부터 값을 담는다
		//각타입의 배열은 해당하는 타입으로 받는다
		//[]:1차원 배열
		int[] intvalue = new int[10];
		
		for(int i=0;i<intvalue.length;i++){
			intvalue[i] = i;
			System.out.println(intvalue[i]);
		}
		System.out.println("==========================================================================");
		
		int[] intvalue2 = new int[17];
		for(int i=0;i<intvalue2.length;i++)
			System.out.println((intvalue2[i]=i+4));
		System.out.println("==========================================================================");
		
		int[] intvalue3 = new int[17];
		int sum = 0;
		for(int i=0;i<intvalue3.length;i++){
			intvalue3[i] = i+4;
			sum += intvalue3[i];
		}
		System.out.println(sum);
		System.out.println("==========================================================================");
	}

}
