package in.co.rays.oop.ExceptionHandling;

public class ExceptionProp {

	public static void main(String[] args) throws LoginException {
	authenticate ("Rajat");
	System.out.println("Invalid Id/Password");

	}

	private static void authenticate(String login) throws LoginException {
		
		if (!"admin".equals(login)) {
			LoginException e= new LoginException();
			throw e;
			
		}
	}

}
