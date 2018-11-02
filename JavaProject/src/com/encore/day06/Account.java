package com.encore.day06;

public class Account {
	protected String accNo;
	protected String ownerName;
	protected int balance;
	
	public Account(){
		
	}
	protected Account(String accNo, String ownerName, int balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	protected int withdraw(int amount) {
		if(balance<amount) {
			System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.");
			return 0;
		}
		balance -= amount;
		//±×·¯¸é ÀÜ¾×Àº?
		return balance;
	}
	
	public void accountInfoPrint() {
		System.out.println("°èÁÂ¹øÈ£´Â "+accNo);
		System.out.println("°èÁÂ ¼ÒÀ¯ÀÚ´Â "+ownerName);
		System.out.println("°èÁÂ ÀÜ¾×Àº "+balance);
	}
}
