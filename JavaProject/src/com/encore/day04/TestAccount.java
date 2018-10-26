package com.encore.day04;

public class TestAccount {

	public static void main(String[] args) {
		Account a = new Account("078-3762-293");
		a.save(1000000);
		a.withdraw(300000);
		
		String accNo = a.getaccNo();
		System.out.println("계좌번호는 "+accNo+" 입니다.");
		// System.out.println(a.accNo); 암호화된 상태여서 계좌정보를 바로 부를 수 없다.
		int balance = a.getbalance();
		System.out.println("현재 계좌의 잔고는 "+balance/10000+"만원 입니다");
	}

}
