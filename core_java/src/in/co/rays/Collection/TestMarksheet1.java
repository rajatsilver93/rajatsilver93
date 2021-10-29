package in.co.rays.Collection;

 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.Iterator;

 public class TestMarksheet1 {
 public static void main(String[] args) {
	
 Marksheet1 m1= new Marksheet1();
 m1.setRollno("2");
 m1.setFname("Rajat");
 m1.setLname("Soni");
 m1.setPhy(80);
 m1.setChe(78);
 m1.setMat(82);

 Marksheet1 m2= new Marksheet1();
 m2.setRollno("1");
 m2.setFname("Sonu");
 m2.setLname("Rathore");
 m2.setPhy(82);
 m2.setChe(85);
 m2.setMat(86);
 
 Marksheet1 m3 = new Marksheet1();
 m3.setRollno("4");
 m3.setFname("Vinay");
 m3.setLname("Gupta");
 m3.setPhy(86);
 m3.setChe(76);
 m3.setMat(78);
 
 Marksheet1 m4 = new Marksheet1();
 m4.setRollno("3");
 m4.setFname("Harsh");
 m4.setLname("Sahu");
 m4.setPhy(70);
 m4.setChe(56);
 m4.setMat(89);
 
 Marksheet1 m5= new Marksheet1();
 m5.setRollno("6");
 m5.setFname("Harsh");
 m5.setLname("Upadhyay");
 m5.setPhy(86);
 m5.setChe(68);
 m5.setMat(89);
 
 Marksheet1 m6= new Marksheet1();
 m6.setRollno("5");
 m6.setFname("Karan");
 m6.setLname("Chawla");
 m6.setPhy(80);
 m6.setChe(78);
 m6.setMat(82);
 
 ArrayList<Marksheet1> l= new ArrayList<Marksheet1>();
 l.add(m1);
 l.add(m2);
 l.add(m3);
 l.add(m4);
 l.add(m5);
 l.add(m6);
 
 TestComparator t= new TestComparator();
 TestPhysics p = new TestPhysics();
 TestChemistry c = new TestChemistry();
 TestMaths n = new TestMaths();
 Collections.sort(l);
 Iterator<Marksheet1> it =l.iterator();
 while (it.hasNext()) {
 Marksheet1 k = (Marksheet1) it.next();
 System.out.println(k.getRollno()+" "+k.getFname()+" "+k.getLname()+" "+k.getPhy()+" "+k.getChe()+" "+k.getMat());
	
 }

 }

 }
