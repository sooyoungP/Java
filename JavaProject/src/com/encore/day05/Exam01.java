package com.encore.day05;

public class Exam01 {

	public static void main(String[] args) {
		Staff[] staff = new Staff[4];
		staff[0] = new Staff("�̺���", "����", 1500000);
		staff[1] = new Staff("�����", "����", 1300000);
		staff[2] = new Staff("�ִ븮", "�븮", 1200000);
		staff[3] = new Staff("�ڻ��", "���", 1000000);

		for (Staff i : staff) {
			i.getTotalSalary();
			i.print();
			System.out.println("�̸�: "+ i.getName());
			System.out.println("��å: "+ i.getTitle());
			System.out.println("�⺻��: "+ i.baseSalary);
			System.out.println("���ɾ�: "+ i.totalSalary);
		}

		for (int i = 0; i < 4; i++) {
			staff[i].getTotalSalary();
			staff[i].print();
		}

	}
}
