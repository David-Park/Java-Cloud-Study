package java20170628.api.pen;

public class RedPen {

	public String pencolor = "빨간색";

	public void setPenColor(String pencolor) {
		this.pencolor = pencolor;
	}

	public String getPenColor() {
		return this.pencolor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedPen red = new RedPen();
		red.setPenColor("빨간색");
		
		//검은펜(BlackPen)
		//검은색 변수 선언
		
		//CommonPen 가서 출력
		//CommonPen class에서 검은색 펜 메소드를 set/get으로 출력
	}

}
