package java20170629;

import java.util.LinkedList;

public class ArrayListExample1 {

	public static void main(String[] args){
		LinkedList link = new LinkedList();
		
		link.add(0);
		link.add(1);
		link.add(2);
		
		System.out.println(link.get(0));
		System.out.println(link.get(1));
		System.out.println(link.get(2));
		System.out.println("==========================================================");
		
		link.clear();
		
		int index = 1;
		
		while(++index <=10)
		{
			link.add(index);
			System.out.println(link.get(index - 2));
		}
	}
}
