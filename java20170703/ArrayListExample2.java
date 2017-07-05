package java20170703;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add(int,index) 1~10
		// iterator() 1~10 Ãâ·Â

		ArrayList array = new ArrayList();
		for (int i = 0; i < 10; i++)
			array.add(i, i + 1);

		for (Iterator it = array.iterator(); it.hasNext();)
			System.out.println(Integer.parseInt(String.valueOf(it.next())));

	}

}
