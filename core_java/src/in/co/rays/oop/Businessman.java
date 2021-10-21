package in.co.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Businessman extends Person {

	public Double income;

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}
	public static void main(String[] args) throws ParseException {
		Businessman b= new Businessman();
		SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
		b.setName("Rajat Soni");
		b.setAdress("indore");
		b.setDOB(f.parse("30/01/1993"));
		b.setIncome(50000.00);
		
		System.out.println(b.getName());
		System.out.println(b.getAdress());
		System.out.println(f.format(b.getDOB()));
		System.out.println(b.getIncome());
	}
	

}
