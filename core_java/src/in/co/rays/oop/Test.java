package in.co.rays.oop;

public class Test {
	public static void main(String[] args) {
		SavingAccount s = new SavingAccount();
		Account1 a = new Account1();
		Account1 sa = new SavingAccount();
		
		System.out.println(s.getAmount());
		System.out.println(a.getAmaount());
		System.out.println(sa.getAmaount());
	}
}
