package com.encore.day04;

public class TestAccount {

	public static void main(String[] args) {
		Account a = new Account("078-3762-293");
		a.save(1000000);
		a.withdraw(300000);
		
		String accNo = a.getaccNo();
		System.out.println("���¹�ȣ�� "+accNo+" �Դϴ�.");
		// System.out.println(a.accNo); ��ȣȭ�� ���¿��� ���������� �ٷ� �θ� �� ����.
		int balance = a.getbalance();
		System.out.println("���� ������ �ܰ�� "+balance/10000+"���� �Դϴ�");
	}

}
