package in.co.rays;

public class Account {
	public String Number;
	public String Acounttype;
	public double Balance;
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public String getAcounttype() {
		return Acounttype;
	}
	public void setAcounttype(String acounttype) {
		Acounttype = acounttype;
	}
	public void Desposit(double d) {
		Balance=d+Balance;
	}
	public void withdraw(double w) {
		Balance=Balance-w;
	}
	public void fundtransfer(double f){
		Balance=Balance-f;
		}
	public void paybill(double p) {
		Balance=Balance-p;
	}
	
	public double getBalance() {
	
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
		} 
	
	public static void main(String[] args) {
		Account h=new Account();
		h.setAcounttype("savings");
		h.setNumber("6598257665");
		h.setBalance(1000);
		h.paybill(100);
		h.Desposit(100);
		h.withdraw(50);
		h.fundtransfer(100);
		
		System.out.println(h.Acounttype);
		System.out.println(h.Number);
		System.out.println(h.Balance);
	
	}

}
