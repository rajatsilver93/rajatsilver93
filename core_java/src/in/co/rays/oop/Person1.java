package in.co.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Person1 {

	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Person p = new Person();
		p.setName("Rajat Soni");
		p.setAdress("indore");
        p.setDOB(sdf.parse("30/01/1993"));
		System.out.println("Name- " + p.getName());
		System.out.println("Adress- " + p.getAdress());
		System.out.println("DOB- " + sdf.format(p.getDOB()));

	}

}
