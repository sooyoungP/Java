package com.encore.day02;

import java.util.Scanner;

public class ���丮�� {

	public static void main(String[] args) {
		// ���丮�� ��������

		Scanner sc = new Scanner(System.in);
		System.out.print("1���� ũ�� 9���� ���� ���ڸ� �Է��ϼ���: ");
		int su = sc.nextInt();

		for (int j = 1; j <= su; j++) {
			int sum = 1;
			for (int i = j; i >= 1; i--) {
				sum = sum * i;
				//System.out.println("===="+sum);
			}
			System.out.println(sum);
		}

	}
}
