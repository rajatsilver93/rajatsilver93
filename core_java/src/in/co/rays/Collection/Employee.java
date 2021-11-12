package in.co.rays.Collection;


public class Employee implements Comparable<Employee> {
private String EmployeeName;
private int Salary;

public Employee() {
	
}

public String getEmployeeName() {
	return EmployeeName;
}

public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}

public int getSalary() {
	return Salary;
}

public void setSalary(int salary) {
	Salary = salary;
}

@Override
public int compareTo(Employee o) {

	return EmployeeName.compareTo(o.EmployeeName);
}



}

	

