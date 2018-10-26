package com.encore.day04;

public class Account {
	private String accNo;
	private int balance;
	
	Account(String accNo){
		this.accNo = accNo;
		print(accNo + "�� ���°� �����Ǿ����ϴ�.");
	}
	String getaccNo(){
		return accNo;
	}
	int getbalance() {
		return balance;
	}
	
	void save(int amount) {
		balance += amount;
		print(accNo + "�� ���¿�"+ amount/10000 +"������ �ԱݵǾ����ϴ�.");
	}
	void withdraw(int amount) {
		balance -= amount;
		print(accNo + "�� ���¿�"+ amount/10000 +"������ ��ݵǾ����ϴ�.");
	}
	void print(String msg) {
		System.out.println(msg);
		System.out.println(accNo + "�� ������ �ܰ��" + balance/10000 + "���� �Դϴ�");
	}
	
}
