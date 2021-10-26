package in.co.rays.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSetInterface {

	public static void main(String[] args) {
		
		HashSet h = new HashSet<>();
		h.add(1);
		h.add(21);
		h.add(31);
		h.add(41);
		h.add(51);
		
		System.out.println(h); // print set in any random order
		
		TreeSet t = new TreeSet<>();
		t.add(93);
		t.add(13);
		t.add(23);
		t.add(633);
		t.add(43);
		
		System.out.println(t); // print in ascending order
		
		LinkedHashSet lh = new LinkedHashSet<>();
		lh.add(55);
		lh.add(15);
		lh.add(25);
		lh.add(35);
		lh.add(45);
		
		System.out.println(lh); // print in insertion order
		
		
	}
}
