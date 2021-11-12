package in.co.rays.Collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmployee1 {
public static void main(String[] args) {
	
Employee1 s=new Employee1();
s.setEployeeName("Rajat");
s.setSalary(50000);

Employee1 s1= new Employee1();
s1.setEployeeName("Sonu");
s1.setSalary(60000);

	
	ArrayList a=new ArrayList();
	a.add(s);
	a.add(s1);
	

	
	Collections.sort(a,new Testsalary1() );
	Iterator<Employee1> i= a.iterator();
	while (i.hasNext()) {
		Employee1 em = (Employee1) i.next();
		System.out.println(em.getEployeeName()+" "+em.getSalary());
		
	}
		
	}
}


