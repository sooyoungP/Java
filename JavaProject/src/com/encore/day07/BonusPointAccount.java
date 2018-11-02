package com.encore.day07;

import com.encore.day06.Account;

public class BonusPointAccount extends Account {

	int bonuspoint;

	public BonusPointAccount(String accNo, String ownerName, int balance, int bonuspoint) {
		super(accNo, ownerName, balance);
		this.bonuspoint = bonuspoint;
	}

	@Override
	public void deposit(int amount) {
		super.deposit(amount); // 부모의 메서드 호출
		bonuspoint += amount *0.01;
	}

	@Override
	public String toString() {
		return "BonusPointAccount 정보는 [bonuspoint=" + bonuspoint + ", accNo=" + accNo + ", ownerName=" + ownerName
				+ ", balance=" + balance + "]";
	}		

	
}
