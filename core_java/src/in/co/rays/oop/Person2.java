package in.co.rays.oop;

public class Person2 {
	protected String fname;
	protected String lname;
	protected String Add;
	public Person2() {
		System.out.println("Person Default");
	}
	public Person2(String fn, String ln) {
		fname=fn;
		lname=ln;
		System.out.println("2 parameter is called");
	}
	public Person2(String fn, String ln, String Ad) {
	
		this(fn,ln);
		Add=Ad;
		//System.out.println("3 parameter is called");

}
	public static void main(String[] args) {
		Person2 p=new Person2("Rajat" ,"Soni" ,"Indore");
		System.out.println(p.fname);
		System.out.println(p.lname);
		System.out.println(p.Add);
	
	}
	
}