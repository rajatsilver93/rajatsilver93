package in.co.rays.oop;

public class Businessman1 implements Richman,Socialworker {
	private String name;
	private String Address;
	public Businessman1(String a, String b) {
		name=a;
		Address=b;
		System.out.println("Name:"+a);
		System.out.println("Address:"+b);
	}

	public Businessman1() {
		
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return Address;
	}

	@Override
	public void earnmoney() {
		
System.out.println("Earnmoney");
	}

	@Override
	public void donation() {
		System.out.println("Giving donation");
	}

	@Override
	public void party() {
		System.out.println("party");
		
		
	}



@Override
public void helpToothers() {
	System.out.println("helping others");
}
	
public static void main(String[] args) {
	Richman rm= new Businessman1("Rajat", "indore");
	rm.earnmoney();
	rm.donation();
	rm.party();
	
	Socialworker sw= new Businessman1();
	sw.helpToothers();
	
}
	
}
