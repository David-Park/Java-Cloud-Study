package mysqljdbc;

public class StaticExample1 {

	//static : 클래스명.변수명 or 객체명, 혹은 메소드
	//static 거는 순간 non-static 보다 먼저 뜬다.
	//모든 객체에서 static으로 변수, 객체, 메소드를 정의하면
	//모든 객체는 해당하는 static을 공유한다.
	
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
