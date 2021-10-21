package in.co.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Doctor extends Person {
public String registrationNo;

public String getRegistrationNo() {
	return registrationNo;
}

public void setRegistrationNo(String registrationNo) {
	this.registrationNo = registrationNo;
}
public static void main(String[] args) throws ParseException {
	Doctor d= new Doctor();
	SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
	d.setName("Gaurav Maheshwari");
	d.setAdress("indore");
	d.setRegistrationNo("5322166");
	d.setDOB(f.parse("4/12/1990"));
	
	System.out.println(d.getName());
	System.out.println(f.format(d.getDOB()));
	System.out.println(d.getAdress());
	System.out.println(d.getRegistrationNo());
	
}
}
