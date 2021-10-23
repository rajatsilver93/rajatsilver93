package in.co.rays.oop;

import in.co.rays.oop.ExceptionHandling.InsufficientFund;

public class TestAccount  {

public static void main(String[] args) throws InsufficientFund {
Account a=new Account();
a.setNumber("12456789");
a.setAccountType("savings");




System.out.println("AccountNumber-- "+a.getNumber());
System.out.println("AccountType-- "+a.getAccountType());
System.out.println("Balance is-- "+a.getBalance());
System.out.println();
a.deposit(500);
a.withdraw(50000);
a.fundTransfer(3000);
a.payBill(6000);
System.out.println();
System.out.println("Remaining Balance  -- "+a.getBalance());


	}

}
