package com.encore.day03;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		call5();
	}
	public static void call5() {
		//���� �� ������ ������ �Է��ϼ���. �����Է� ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� ������ ������ �Է��ϼ���: ");
		int count = sc.nextInt();
		int[] score =new int[count];
		System.out.print("������ �Է��ϼ���: ");
		int total =0;
		for(int i=0; i<count; i++) {
			score[i] = sc.nextInt();
			total += score[i];
		}
		System.out.println("����:"+total);
		System.out.println("���:"+total/count);
	}

	public static void call4() {
		// ����ڿ��� ģ�� �̸��� �Է¹���.
		Scanner sc = new Scanner(System.in);
		String[] friend;

		System.out.print("ģ�� ģ�� ����̾�?: ");
		int bf = sc.nextInt();
		friend = new String[bf]; // null�� �ʱ�ȭ�� �ȴ�.
		System.out.print("ģ���̸��� �Է��ϼ���: ");
		for (int i = 0; i < bf; bf++) {
			friend[i] = sc.next();
			System.out.println(friend[i] + "���̶� ģ�Ͻñ���");
		}
		for (int i = 0; i < bf; bf++) {
			System.out.println(friend[i] + "�ּҷϿ� ����Ǿ�����");
		}
		sc.close();

	}

	public static void call3() {
		// �̸� �������� �����Ѵ�.
		String[] friend = { "�ӿձ�", "�ڼҿ�", "ģ��1", "ģ��2" };

		for (int i = 0; i < friend.length; i++) {
			System.out.println(friend[i] + "�����");
		}
	}

	public static void call2() {
		// ���� 5���� �����϶�
		int[] score;
		score = new int[] { 80, 90, 85, 98, 100 };
		// int[] score = new int[5]; ���� 2�ٰ� ���� �ǹ�

		double total = 0;
		double avg;

		for (int i = 0; i < score.length; i++) {
			total = total + score[i];
		}
		System.out.println("������" + total);
		avg = total / score.length;
		System.out.println("�����" + avg);
	}

	public static void call() {
		// �迭 : ������ �̸����� ������ Ÿ���� �������� ���� ���Ӱ����� �����ϱ� ���� �ڷᱸ��.
		// 1. �迭 ���� ����
		int[] score; // �� ��ȣ�Ѵ�. int score2[];�Ѵ� ��밡��
		char[] carr;

		// 2. �迭 ����(new)....�ڵ� �ʱ�ȭ�� �ȴ�. Ÿ���� int�̸� 0���� �ڵ� �ʱ�ȭ�� �ȴ�.
		score = new int[10];
		carr = new char[5]; // �ڵ� �ʱ�ȭ �Ϸ�. ''�������� �ʱ�ȭ�� �ȴ�.
		// 3. �迭 ���
		System.out.println(score[0]);
		System.out.println(score[9]);
		System.out.println("����:" + score.length); // ������ : �ݺ������� ����ϱ� ����.

		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		for (int i = 0; i < carr.length; i++) {
			System.out.println("charŸ��:" + i + "����" + carr[i] + "*");
		}
		// ����� ����
		boolean[] barr = new boolean[5];

		for (int z = 0; z < barr.length; z++) {
			System.out.println("booleanŸ��:" + z + "��°" + carr[z] + "*");
		}

		// ���� + ����+ �Ҵ�
		// String[] str = new string[] {"Ŀ��","����","��"};
		String[] str = { "Ŀ��", "����", "��" };
		for (int k = 0; k < str.length; k++) {
			System.out.println(str[k]);
		}

	}
}
