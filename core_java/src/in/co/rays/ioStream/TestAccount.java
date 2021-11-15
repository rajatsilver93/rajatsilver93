package ioStream;

public class TestAccount extends Thread {
	public static Account data= new Account();
	String name ;
	public TestAccount(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			data.deposit(name, 100);
		//super.run();
		}
	}
	}


