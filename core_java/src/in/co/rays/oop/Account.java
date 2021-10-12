package in.co.rays.oop;

public class Account extends TestAccount {

private String number;
private String accountType;
private Double balance=25000.00;
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public Double getBalance() {
	return balance;
}
public void setBalance(double i) {
	this.balance = i;
}

public void deposit(double d) {
	balance=balance+d;
	System.out.println("Deposit +"+ d);
}
public void withdraw(double w) {
	balance=balance-w;
	System.out.println("Withdraw -"+ w);
}
public void fundTransfer(double f) {
	balance=balance-f;
	System.out.println("fundTransfer -"+f);
}
public void payBill(double p) {
	balance=balance-p;
	System.out.println("billPayment -"+p);
}


	}

