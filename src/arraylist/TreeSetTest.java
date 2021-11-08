package arraylist;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetTest {
	
public static void main(String[] args) {
		
		TreeSet<Integer> a1=new TreeSet<Integer>();
		
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
