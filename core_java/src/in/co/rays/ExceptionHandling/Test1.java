package in.co.rays.oop.ExceptionHandling;

public class Test1 {

	public static void main(String[] args) {
		
		try {String name = "Rajat";
		System.out.println("Lenght of the name is " + name.length());
		System.out.println("Character at 6th position "+ name.charAt(6));

	}
		catch (Exception e) {
			System.err.println(e.getMessage());
		try {
			String name = "soni";
		System.out.println("Lenght of the name is " + name.length());
		System.out.println("Character at 5th position"+ name.charAt(5));

			
		} catch (Exception e2) {
			System.err.println(e2.getMessage());
			
		}
		finally {
			System.out.println("tata bye bye");
		}

	}
	}
}