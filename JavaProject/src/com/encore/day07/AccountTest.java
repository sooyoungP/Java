package com.encore.day07;

import com.encore.day06.CreditLineAccount;

public class AccountTest {

	public static void main(String[] args) {
		BonusPointAccount acc = new BonusPointAccount("112","박소영",1000,100);
		
		acc.deposit(2000);
		System.out.println(acc.bonuspoint);
		acc.accountInfoPrint();
		
		CreditLineAccount acc2 = new CreditLineAccount("113","박소영2",5000,2000);
		acc2.accountInfoPrint();

	}

}
