package in.co.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student extends Person {
public String rollNo;
public int marks;
public String getRollNo() {
	return rollNo;
}
public void setRollNo(String rollNo) {
	this.rollNo = rollNo;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public static void main(String[] args) throws ParseException {

Student s= new Student();
SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
s.setName("Harsh Sahu");
s.setRollNo("55685559556");
s.setAdress("indore");
s.setDOB(f.parse("12/10/2001"));
s.setMarks(350);

System.out.println(s.getName());
System.out.println(s.getAdress());
System.out.println(f.format(s.getDOB()));
System.out.println(s.getRollNo());
System.out.println(s.getMarks());

}
}