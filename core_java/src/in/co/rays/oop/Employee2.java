package in.co.rays.oop;

public class Employee2 extends Person3 {
	
	
	public void ChangeAddress() {
		
		super.ChangeAddress();
		System.out.println("Employee changed Address");
		System.out.println("Bhopal");
	}

	public static void main(String[] args) {
	Employee2 s= new Employee2();
     s.ChangeAddress();
	}

}
