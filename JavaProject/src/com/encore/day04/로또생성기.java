package com.encore.day04;

import java.util.Arrays;

public class �ζǻ����� {
	public static void call() {
		// ������ �� �����
		double su = Math.random(); // ������ ���� �߻��Ѵ�. 0<=su<1������ �Ǽ��� ���´�. ������ �������� ���´�.
		int num = (int) (su * 10);// 1~10������ �� //���ϴ� ���ڸ�ŭ �����ش�.
		int num2 = (int) (su * 45) + 1; // 1~45������ ��(������ ���� ���Խ�Ű�� ������ 1�� ���ϸ� �ȴ�)
		System.out.println(su);
		System.out.println(num);
	}

	public static void call2() {
		// �������� ������ �� (1~45����)
		for (int i = 1; i <= 6; i++) {
			int su = (int) (Math.random() * 45) + 1;
			System.out.println(su);
		}

	}

	public static void call3() {
		int[] happy = new int[6];
		int cnt = 0;
		aa: while (true) {
			if (cnt == 6)break; // �ݺ��� ������

			int su = (int) (Math.random() * 45) + 1;
			// �ߺ�����
			
			for (int i = cnt - 1; i >= 0; i--) {
				if (su == happy[i])
					continue aa;
			}
			happy[cnt] = su;
			cnt++;
		}
		System.out.println(Arrays.toString(happy));
	}

	public static void main(String[] args) {
		call3();
	}

}
