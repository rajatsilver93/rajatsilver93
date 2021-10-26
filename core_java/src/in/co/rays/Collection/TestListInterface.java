package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class TestListInterface {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		System.out.println(a);
		System.out.println(a.subList(1, 3));
		
		LinkedList l = new LinkedList<>();
		l.add(22);
		l.add(232);
		l.add(422);
		l.add(522);
		l.set(1, 124);
		System.out.println(l);

		Vector v = new Vector<>();
		v.add(44);
		v.add(144);
		v.add(244);
		v.add(344);
		v.remove(0);
		System.out.println(v.lastIndexOf(244));

		System.out.println(v);
		
	}

}
