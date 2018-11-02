package com.encore.day06;

public class CheckingAccount extends Account {
	String cardNo;

	public CheckingAccount(String accNo, String ownerName, int balance, String cardNo) {
		super(accNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	public int pay(String cardNo, int amount) {
		if(cardNo.equals(this.cardNo) == false) {
			System.out.println("ī���ȣ �Է� ����");
			return 0;
		}
		return withdraw(amount);
	}
}
