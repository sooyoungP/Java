package com.encore.day06;

public class AccountTest {
	public static void call() {
		Account acc = new Account("111-11111","�ڼҿ�", 1000);
		acc.deposit(2000);
		System.out.println(acc.withdraw(1200)+"���");
		System.out.println("�ܾ���"+acc.balance);
	}
	
	public static void call2() {
		CheckingAccount acc = new CheckingAccount("112","������", 2000,"555");
		acc.deposit(3000);
		System.out.println("���: " +acc.withdraw(3000));
		System.out.println("���: " +acc.pay("666",500));
	}
	
	public static void call3() {
		CreditLineAccount acc = new CreditLineAccount("123","�ӿձ�", 5000, 1000);
		
		acc.deposit(1000);
		System.out.println(acc.balance);
		System.out.println(acc.withdraw(5000));
	}
	
	public static void main(String[] args) {
		call3();
	}

}
