package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

public static void main(String[] args) {

ArrayList v= new ArrayList<>();
v.add("rajat");
v.add("soni");
Iterator it= v.iterator();


while (it.hasNext()) {
	Object o = (Object) it.next();
	System.out.println(o);
//for (Object o : v) {
	//System.out.println(o);
}
	
}


	}

