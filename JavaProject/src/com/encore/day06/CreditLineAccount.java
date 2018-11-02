package com.encore.day06;

public class CreditLineAccount extends Account {

	int CreditLine;


	public CreditLineAccount(String accNo, String ownerName, int balance, int creditLine) {
		super(accNo, ownerName, balance);
		this.CreditLine = creditLine;
	}

	// override : �����, ������
	// �޼��� �̸��� ����, �Ű������� ����, return�� ���ƾ� �Ѵ�. ���� �����ڴ� ���ų� �� �о���Ѵ�.

	@Override // �������ϴ� �ּ�
	public int withdraw(int amount) {
		if (CreditLine < amount) {
			System.out.println("�ܾ��� �����մϴ�.");
			return 0;
		}
		balance -= amount;
		return balance;

	}
}
