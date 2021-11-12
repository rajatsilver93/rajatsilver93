package ioStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestEmployee {

	public static void main(String[] args) throws Exception {
		FileOutputStream file=new FileOutputStream("D:/object.ser");
		ObjectOutputStream out= new ObjectOutputStream(file);
		Employee emp= new Employee(55,"Rajat", "soni");
		
		out.writeObject(emp);
		out.close();
		System.out.println("object is successfully persisted");
		

	}

}
