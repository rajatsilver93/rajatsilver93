package ioStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class Testiostream {

public static void main(String[] args) throws Exception {
	File f = new File("D:/r.txt");
  if (f.exists()) {
	  System.out.println("Name "+ f.getName());
	  System.out.println("Absolute Path "+ f.getAbsolutePath());
	  System.out.println("Is writable "+f.canWrite());
	  System.out.println("Is readable "+f.canWrite());
	  System.out.println("Is file "+f.isFile());
	  System.out.println("IS Directory "+f.isDirectory());
	  System.out.println("Last Modified at "+ new Date(f.lastModified()));
	  System.out.println("Lenght "+f.length()+ "bytes long.");
	
	
	  
      //Display only File from Folder 
//	  File directory= new File("D:/");
//	  String[] list=directory.list();
//	  for (int i = 0; i < list.length; i++) {
//		  
//		  File f = new File("D:/",list[i]);
//		  if (f.isFile()) {
//			System.out.println(list[i]);
	
	
	//	}
	
	//read char From a file
//	FileReader ff= new FileReader("D:/r.txt");
//	int ch=ff.read();
//	char g;
//	while (ch !=-1) {
//		g=(char)ch;
//		System.out.println(g);
//		ch=ff.read();
	
	//Read a file line by line
//	FileReader ff = new FileReader("D:/r.txt");
//	BufferedReader b = new BufferedReader(ff);
//	String line= b.readLine();
//	while (line !=null) {
//	 System.out.println(line);	
//	 line= b.readLine();
//		
	}
		
		
	}		
	}





