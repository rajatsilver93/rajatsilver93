package ioStream;

import java.io.FileReader;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) throws Exception {
	FileReader r = new FileReader("D:/bb.txt");
    Scanner sc= new Scanner(r);
    while (sc.hasNext()) {
	System.out.println(sc.nextLine());
	
		
	}
    r.close();
	}

}
