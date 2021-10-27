package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Testmarksheet {


public static void main(String[] args) {
ArrayList m = new ArrayList<>();
m.add(new Marksheet("a4", "Rajat s", 90));
m.add(new Marksheet("a2", "Sonu r", 91));
m.add(new Marksheet("a3", "Vinay g", 92));
Collections.sort(m);
for (Object o : m) {
	System.out.println(o);
	
}
}
}