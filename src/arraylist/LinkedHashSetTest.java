package arraylist;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	
public static void main(String[] args) {
		
		LinkedHashSet<Integer> a1=new LinkedHashSet<Integer>();
		
		a1.add(34);
		a1.add(12);
		a1.add(9);
		a1.add(54);
		a1.add(69);
		a1.add(34);
		a1.add(58);
		a1.add(86);
		a1.add(36);
		a1.add(34);
		a1.add(9);
		System.out.println(a1.size());
		System.out.println(a1);
	}


}
