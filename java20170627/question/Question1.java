package java20170627.question;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<10;i++)
			System.out.print("3x" + i + "=" + 3 * i + "\t");
		System.out.println();
		System.out.println("==========================================================================");
		int x = 0;
		while(++x <= 9)
			System.out.print("5x" + x + "=" + 5 * x + "\t");
		System.out.println();
		System.out.println("==========================================================================");
		x=1;
		do{
			System.out.print("7x" + x + "=" + 7 * x + "\t");
		}while(++x<=9);
		System.out.println();
		System.out.println("==========================================================================");
		
		for(int i=1;i<10;i++)
		{
			System.out.println("3x" + i + "=" + 3 * i);
		}
		System.out.println("==========================================================================");
		x=0;
		while(++x<=9)
		{
			System.out.println("5x" + x + "=" + 5 * x);
		}
		System.out.println("==========================================================================");
		x=1;
		do{
			System.out.println("7x" + x + "=" + 7 * x);
		}while(++x<=9);
		System.out.println("==========================================================================");
		
//		for (int i = 3; i <= 7; i += 2) {
//			for (int j = 1; j < 10; j++)
//				System.out.print(i + "x" + j + "=" + i * j + "\t");
//			System.out.println();
//		}
//		System.out.println("==========================================================================");
//		
//		int x =1;
//		while((x+=2)<=7) {
//			for (int j = 1; j < 10; j++)
//				System.out.print(x + "x" + j + "=" + x * j + "\t");
//			System.out.println();
//		}
//		System.out.println("==========================================================================");
//		
//		x = 3;
//		do {
//			for (int j = 1; j < 10; j++)
//				System.out.print(x + "x" + j + "=" + x * j + "\t");
//			System.out.println();
//		}while((x+=2) <= 7);
//		System.out.println("==========================================================================");
//		
//		for (int j = 1; j < 10; j++) {
//			for (int i = 3; i <= 7; i += 2)
//				System.out.print(i + "x" + j + "=" + i * j + "\t");
//			System.out.println();
//		}
//		System.out.println("==========================================================================");
//		
//		for (int j = 1; j < 10; j++) {
//			x = 1;
//			while((x+=2)<=7)
//				System.out.print(x + "x" + j + "=" + x * j + "\t");
//			System.out.println();
//		}
//		System.out.println("==========================================================================");
//		
//		for (int j = 1; j < 10; j++) {
//			x = 3;
//			do {
//				System.out.print(x + "x" + j + "=" + x * j + "\t");
//			} while ((x += 2) <= 7);
//			System.out.println();
//		}
//		System.out.println("==========================================================================");
	}

}
