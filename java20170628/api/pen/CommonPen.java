package java20170628.api.pen;

public class CommonPen {

	public String penname = "�𳪹�";

	public void setPenName(String penname) {
		this.penname = penname;
	}

	public String getPenName(){
		return this.penname;
	}

	// ctrl+shift+r : ���ϸ� ã��
	public static void main(String[] args) {
		CommonPen comm = new CommonPen();
//		System.out.println(comm.penname);
		
		comm.setPenName("��������");
		System.out.println(comm.getPenName());
		System.out.println("==========================================================");
		
		BlackPen black = new BlackPen();
		black.setPencolor("������");
		System.out.println(black.getPencolor());

	}

}
