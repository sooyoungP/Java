package com.encore.day04;

public class Account {
	private String accNo;
	private int balance;
	
	Account(String accNo){
		this.accNo = accNo;
		print(accNo + "의 계좌가 개설되었습니다.");
	}
	String getaccNo(){
		return accNo;
	}
	int getbalance() {
		return balance;
	}
	
	void save(int amount) {
		balance += amount;
		print(accNo + "의 계좌에"+ amount/10000 +"만원이 입금되었습니다.");
	}
	void withdraw(int amount) {
		balance -= amount;
		print(accNo + "의 계좌에"+ amount/10000 +"만원이 출금되었습니다.");
	}
	void print(String msg) {
		System.out.println(msg);
		System.out.println(accNo + "의 계좌의 잔고는" + balance/10000 + "만원 입니다");
	}
	
}
