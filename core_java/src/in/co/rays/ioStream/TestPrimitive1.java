package ioStream;

import java.io.DataInputStream;
import java.io.FileInputStream;


public class TestPrimitive1 {

	public static void main(String[] args) throws Exception {
    FileInputStream f = new FileInputStream("D:/primitivedata.dat");
     
    DataInputStream in = new DataInputStream(f);
    System.out.println(in.readInt());
    System.out.println(in.readBoolean());
    System.out.println(in.readChar());
    System.out.println(in.readDouble());
    in.close();
	}

}
