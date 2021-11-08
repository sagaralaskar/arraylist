package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoArrayList {

	public static void main(String[] args) {
		
		
		ArrayList al= new ArrayList();
		System.out.println(al);

		al.add("java");
		al.add("php");
		al.add("java");
		al.add(10);
		al.add(15.5f);
		al.add(null);
		al.add(0);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains("php"));
		System.out.println(al.equals("java"));
		System.out.println(al.get(3));
		System.out.println(al.isEmpty());
		System.out.println(al.lastIndexOf("java"));
		System.out.println(al.remove(2));
		System.out.println(al);
		System.out.println(al.set(1, 10));
		System.out.println(al);
		 //al.clear();

	     ArrayList al1= new ArrayList(al);
	     al1.add("sagar");
	     al1.add("selenium");
	     System.out.println(al1);
	     
	     ArrayList al2= new ArrayList(2);
	
		al2.add(10);
		al2.add(20);
		System.out.println(al2.size());
		al2.add(30);
		al2.add(40);
		System.out.println(al2.size());
	}
		
}


