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
			System.out.println("�ܾ��� �����մϴ�.");
			return 0;
		}
		balance -= amount;
		//�׷��� �ܾ���?
		return balance;
	}
	
	public void accountInfoPrint() {
		System.out.println("���¹�ȣ�� "+accNo);
		System.out.println("���� �����ڴ� "+ownerName);
		System.out.println("���� �ܾ��� "+balance);
	}
}
