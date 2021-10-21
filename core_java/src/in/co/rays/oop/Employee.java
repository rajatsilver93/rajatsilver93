package in.co.rays.oop;

public class Employee extends Person2 {
	
private String  Designation;

public Employee() {
	
}
public Employee(String fn , String ln , String des) {
	super(fn, ln);
	Designation=des;
	System.out.println("3 Peram constructor");
	
}

public static void main(String[] args) {
	Employee e= new Employee("rajat","soni","devloper");
	System.out.println(e.fname);
	System.out.println(e.lname);
	System.out.println(e.Designation);
}
}
