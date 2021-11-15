package ioStream;

public class Account {
private int balance=0;
public synchronized void deposit(String message, int amount) {
	int bal=getBalance();
	setBalance(bal+amount);
	System.out.println(message+" "+"balance is:-"+getBalance());
}
public int getBalance() {
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
}
