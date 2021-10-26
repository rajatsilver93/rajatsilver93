package in.co.rays.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



public class TestMapInterface {
	
	public static void main(String[] args) {
		
		HashMap m = new HashMap();
		m.put(1, "Ajay");
		m.put(2, "Binod");
		m.put(3, "Chetan");
		m.put(4, "Damodar");
		m.put(5, "Ram");
		//System.out.println();
		//System.out.println(m.keySet());
		//System.out.println(m.values());
		//System.out.println(m.isEmpty());
		System.out.println(m);		
		
		/*
		 * Map t = new TreeMap<>(); t.put(3, "Mr. Chetan"); t.put(4, "Mr. Damodar");
		 * t.put(5, "Mr. Ram"); t.put(1, "Mr. Ajay"); t.put(2, "Mr. Binod");
		 * 
		 * 
		 * System.out.println(t); //print in ascending order
		 * System.out.println(t.size());
		 */
		
	}

}
