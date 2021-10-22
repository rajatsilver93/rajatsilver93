package in.co.rays.oop.ExceptionHandling;

public class Test {

	public static void main(String[] args) {
		
		try {String name = "Rajat";
		System.out.println("Lenght of the name is " + name.length());
		System.out.println("Character at 4th position "+ name.charAt(4));
		 
		try {
			String s= "soni";
			System.out.println("Lenght of the name is " + s.length());
			System.out.println("Character at 6th position"+ s.charAt(6));
		} catch (Exception e) {
			//System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}
		catch (Exception s) {
			System.err.println(s.getMessage());
		}

}
}

	


