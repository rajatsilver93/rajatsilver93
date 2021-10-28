package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class FailFastIterator {

	public static void main(String[] args) {
	ArrayList a = new ArrayList<>();
	a.add("rajat");
	a.add("sonu");
	a.add("vinay");
	a.add("harsh");
	
	Iterator it = a.iterator();
   // a.add("soni");
    while (it.hasNext()) {
		Object o = (Object) it.next();
		 System.out.println(o.hashCode());
	}
   
	
	

	}

}
