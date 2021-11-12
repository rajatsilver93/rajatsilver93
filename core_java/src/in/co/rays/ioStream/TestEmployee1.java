package ioStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class TestEmployee1 {
	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("D:/object.ser");
		ObjectInputStream out= new ObjectInputStream(file);
		Employee e=(Employee)(out.readObject());
		System.out.println(e.getFname());
		System.out.println(e.getLname());
		System.out.println(e.getId());
		
		

		System.out.println();
		

	}




}
