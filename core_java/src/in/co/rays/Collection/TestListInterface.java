package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class TestListInterface {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList<>();
		a.add(55);
		a.add(5);
		a.add(15);
		a.add(25);
		
		//System.out.println(a);
		//System.out.println(a.subList(1, 3));
		Collections.sort(a);
	//	System.out.println(a);
		
		LinkedList l = new LinkedList<>();
		l.add(223);
		l.add(23);
		l.add(522);
		l.add(422);
		//l.set(1, 124);
		//System.out.println(l);
		//Collections.sort(l);
		//System.out.println(l);
		
		System.out.println(l.lastIndexOf(522));

		Vector v = new Vector<>();
		v.add(44);
		v.add(144);
		v.add(544);
		v.add(344);
		//v.remove(0);
		//System.out.println(v.lastIndexOf(344));

		//System.out.println(v);
		Collections.sort(v);
		//System.out.println(v);
		
	}

}
