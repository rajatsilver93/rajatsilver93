package ioStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;

import org.omg.CosNaming.IstringHelper;

public class Testiostream1 {

	public static void main(String[] args) throws Exception {
		//copy binary file
		/*
		 * String source = "D:/sd.JPG"; 
		 * String target = "D:/rajat.JPG";
		 * 
		 * FileInputStream reader= new FileInputStream(source); FileOutputStream writer=
		 * new FileOutputStream(target);
		 * 
		 * int ch=reader.read(); while (ch!=1) { writer.write(ch); ch=reader.read();
		 * 
		 * } reader.close(); writer.close(); System.out.println(source +"is copied to" +
		 * target);
		 */
		
		
		// copy con 
		String target = "D:/r.txt";
		FileWriter writer = new FileWriter(target);
		PrintWriter p = new PrintWriter(writer);
		System.out.println("java");
		
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(reader);
		
		String line = in.readLine();
		while (!line.equals("quit")) {
			p.println(line);
			line=in.readLine();
			
			
		}
		p.close();
		reader.close();
	}

}
