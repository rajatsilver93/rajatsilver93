package ioStream;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private int id;
	private String fname;
	private String lname;
	private transient String pass;
	
	public Employee() {	
	}
	public Employee(int id, String fname, String lname) {
	this.id=id;
	this.fname= fname;
	this.lname=lname;

	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getPass() {
		return pass;
	}
}

