package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Compare {

	public static void main(String[] args) {
		int z ;
		double t=0;
		double r=0;
	
	ArrayList a = new ArrayList<>();
	for (int i = 0; i < 100000; i++) {
		a.add(i);
		t=System.currentTimeMillis();
		
	}
	HashSet h = new HashSet<>();
    h.addAll(a);
	
	for (int i = 0; i <= 50; i++) {
	z=(int) (Math.random()*h.size());
	System.out.println(i+" "+z);
	r=System.currentTimeMillis();
	}
	
System.out.println(t + " -:time taken");
System.out.println(r + " -:time taken");
	
	}
	
	}


