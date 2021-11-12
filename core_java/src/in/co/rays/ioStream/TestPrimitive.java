package ioStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class TestPrimitive {

	public static void main(String[] args) throws Exception {
		FileOutputStream file= new FileOutputStream("D:/primitivedata.dat");
		
	DataOutputStream out = new DataOutputStream(file);
	out.writeInt(2);
	out.writeBoolean(true);
	out.writeChar('R');
	out.writeDouble(2.2);
	out.close();
	file.close();
	System.out.println("Primitive Data successfully written");

	}

}
