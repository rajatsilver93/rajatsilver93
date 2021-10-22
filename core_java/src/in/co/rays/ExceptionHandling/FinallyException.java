package in.co.rays.oop.ExceptionHandling;


public class FinallyException {

	public static void main(String[] args) {
		String name = "Rajat";
		try {
		System.out.println("Lenght of the name is " + name.length());
		System.out.println("Character at 7th position"+ name.charAt(6));

	}
		catch (Exception e) {
			System.err.println(e.getMessage());
		
		System.exit(500);
		}
finally {
	System.out.println("stop");
	
}
	}
}