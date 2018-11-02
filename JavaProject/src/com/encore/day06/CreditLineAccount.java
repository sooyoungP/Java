package com.encore.day06;

public class CreditLineAccount extends Account {

	int CreditLine;


	public CreditLineAccount(String accNo, String ownerName, int balance, int creditLine) {
		super(accNo, ownerName, balance);
		this.CreditLine = creditLine;
	}

	// override : 덮어쓰기, 재정의
	// 메서드 이름이 같고, 매개변수도 같고, return도 같아야 한다. 접근 제한자는 같거나 더 넓어야한다.

	@Override // 컴파일하는 주석
	public int withdraw(int amount) {
		if (CreditLine < amount) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		balance -= amount;
		return balance;

	}
}
