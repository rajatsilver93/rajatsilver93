package in.co.rays.oop.ExceptionHandling;

public class MultiExceptionhandling {

	public static void main(String[] args) {
		
		String name ="Vijay";
		try {
			System.out.println(name.length());
		    System.out.println(name.charAt(5));
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Name can't be null");
		}
		catch (Exception e) {
			System.out.println("String is small");
		}
		finally {
			System.out.println("tata bye bye khatam gya");
		}
		

	}

}
