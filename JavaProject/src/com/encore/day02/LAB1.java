package com.encore.day02;

import java.util.Scanner;

public class LAB1 {

	public static void main(String[] args) {
		// ����1
		Scanner sc = new Scanner(System.in);
		System.out.println("1���� ũ�� 10���� ���� ������ �Է��ϼ���. :");
		int su = sc.nextInt();
		if (su <=1 || su >= 10) {
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			sc.close();
		}else {
			for (int gop =1; gop<=9; gop++) {
				System.out.printf("%dx%d=%d\n", su, gop, su*gop);
			}

		}
	}
}