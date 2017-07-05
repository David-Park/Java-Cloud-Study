package java20170703;

import java.util.ArrayList;
import java.util.Hashtable;

public class Array_HashExample1 {
	public String userid;
	public String passwd;
	public int intvalue;

	public Array_HashExample1() {

	}

	public Array_HashExample1(int intvalue) {
		this.intvalue = intvalue;
	}

	public int getIntvalue() {
		return intvalue;
	}

	public void setIntvalue(int intvalue) {
		this.intvalue = intvalue;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_HashExample1 array = new Array_HashExample1();
		array.setUserid("ȫ�浿");
		array.setPasswd("1234");

		ArrayList list = new ArrayList();
		list.add(0);

		Hashtable table = new Hashtable();
		table.put(0, 0);
		table.put(2, array);
		list.add(table);

		Hashtable hash = (Hashtable) list.get(1);
		int value = Integer.parseInt(String.valueOf(hash.get(0)));
		Array_HashExample1 array2 = (Array_HashExample1) hash.get(2);
		System.out.println(value);
		System.out.println(array2.getUserid());
		System.out.println(array2.getPasswd());
		System.out.println("===========================================");

		list.clear();
		hash.clear();

		ArrayList list2 = new ArrayList();

		for (int i = 1; i <= 10; i++) {
			list2.add(new Array_HashExample1(i));
		}
		hash.put(0, list2);
		System.out.println("===========================================");

		for (int i = 0; i < hash.size(); i++) {
			ArrayList array5 = (ArrayList)hash.get(i);
			for(int j=0;j<array5.size();j++)
				System.out.println(((Array_HashExample1)array5.get(j)).getIntvalue());
		}

	}

}
