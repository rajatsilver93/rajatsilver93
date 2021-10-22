package in.co.rays.oop.ExceptionHandling;

public class GenericCatch {

	public static void main(String[] args) {
		String name = "Rajat";
		try {
		System.out.println("Lenght of the name is " + name.length());
		System.out.println("Character at 7th position"+ name.charAt(6));

	}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}

}
}