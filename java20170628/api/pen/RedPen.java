package java20170628.api.pen;

public class RedPen {

	public String pencolor = "������";

	public void setPenColor(String pencolor) {
		this.pencolor = pencolor;
	}

	public String getPenColor() {
		return this.pencolor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedPen red = new RedPen();
		red.setPenColor("������");
		
		//������(BlackPen)
		//������ ���� ����
		
		//CommonPen ���� ���
		//CommonPen class���� ������ �� �޼ҵ带 set/get���� ���
	}

}
