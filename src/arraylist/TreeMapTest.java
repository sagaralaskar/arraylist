package arraylist;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapTest {
	
public static void main(String[] args) {
		
		TreeMap<Integer,String> hm=new TreeMap<>();
		
		hm.put(12, "india");
		hm.put(52, "india2");
		hm.put(9, "india3");
		hm.put(99, "india4");
		hm.put(45, "india5");
		hm.put(78, "india6");
		hm.put(3, "india7");
		hm.put(75, "india8");
		hm.put(34, "india9");
		System.out.println(hm);
		System.out.println(hm.size());
		
		
	}

}
