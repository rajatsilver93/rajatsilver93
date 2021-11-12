package in.co.rays.Collection;

import java.util.Comparator;

public class Testsalary1 implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		
		return o2.getSalary()-o1.getSalary();
	}

}
