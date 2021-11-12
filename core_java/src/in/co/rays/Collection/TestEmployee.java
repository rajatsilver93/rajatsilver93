package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmployee {

public static void main(String[] args) {
	
	Employee e1= new Employee();
	e1.setEmployeeName("Sonu Rathore");
	e1.setSalary(50000);
	
	Employee e2= new Employee();
	e2.setEmployeeName("Rajat Soni");
	e2.setSalary(52000);
	
	Employee e3= new Employee();
	e3.setEmployeeName("vinay Gupta");
	e3.setSalary(53000);
	
	ArrayList<Employee> l = new ArrayList<Employee>();
	l.add(e1);
	l.add(e2);
	l.add(e3);
    TestSalary t = new TestSalary();
    
	Collections.sort(l,t);
	Iterator<Employee> it = l.iterator();
	while (it.hasNext()) {
		Employee emp = (Employee) it.next();
		System.out.println(emp.getEmployeeName()+ " " + emp.getSalary());
		
	}
	}
	
	

	}


