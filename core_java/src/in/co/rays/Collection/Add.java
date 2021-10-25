package in.co.rays.Collection;

import java.util.ArrayList;

public class Add {

	public static void main(String[] args) {
		ArrayList c = new ArrayList();
		c.add(566);
		c.add(5);
		c.add("Rajat");
		c.add("rays");

		// c.removeAll(c);
		// c.remove(2);
        // System.out.println(c);
        // System.out.println(c.size());
        // c.clear();
		// System.out.println(c.contains(15));
		// System.out.println(c.isEmpty());

		ArrayList a = new ArrayList();
		a.add(556);
		a.add("soni");
		a.add(5);
		a.add("rays");
		// a.addAll(c);
		// System.out.println(a);
		System.out.println(a.retainAll(c));
		System.out.println(a);
		// System.out.println(a);
		// for (Object o : c) {
		// System.out.println(o);

	}
}
