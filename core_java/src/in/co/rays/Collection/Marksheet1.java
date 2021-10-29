package in.co.rays.Collection;

public class Marksheet1 implements Comparable<Marksheet1>{

private String rollno;
private String fname;
private String lname;
private int phy;
private int che;
private int mat;

public Marksheet1() {

}
public String getRollno() {
	return rollno;
}
public void setRollno(String rollno) {
	this.rollno = rollno;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getPhy() {
	return phy;
}
public void setPhy(int phy) {
	this.phy = phy;
}
public int getChe() {
	return che;
}
public void setChe(int che) {
	this.che = che;
}
public int getMat() {
	return mat;
}
public void setMat(int mat) {
	this.mat = mat;
}
@Override
public int compareTo(Marksheet1 m) {
	
	return rollno.compareTo(m.rollno);
}

}
