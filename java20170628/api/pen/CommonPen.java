package java20170628.api.pen;

public class CommonPen {

	public String penname = "모나미";

	public void setPenName(String penname) {
		this.penname = penname;
	}

	public String getPenName(){
		return this.penname;
	}

	// ctrl+shift+r : 파일명 찾기
	public static void main(String[] args) {
		CommonPen comm = new CommonPen();
//		System.out.println(comm.penname);
		
		comm.setPenName("몽땅연필");
		System.out.println(comm.getPenName());
		System.out.println("==========================================================");
		
		BlackPen black = new BlackPen();
		black.setPencolor("검은색");
		System.out.println(black.getPencolor());

	}

}
