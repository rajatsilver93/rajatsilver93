package in.co.rays.oop.ExceptionHandling;

public class Test2 {

	public static void main(String[] args) {
		
		try {String name = "Rajat";
		System.out.println("Lenght of the name is " + name.length());
		System.out.println("Character at 7th position"+ name.charAt(6));

	}
		catch (Exception e) {
			System.err.println(e.getMessage());

	}
		finally {
			System.out.println("stop");
			try {String name = "soni";
			System.out.println("Lenght of the name is " + name.length());
			System.out.println("Character at 7th position"+ name.charAt(4));

		}
			catch (Exception e) {
				System.err.println(e.getMessage());

		}

}
}
}