package com.encore.day08;

class Dice {
	// ����
	int size;

	// �ʱ�ȭ
	Dice(int size) {
		this.size = size;
	}

	// �޼���
	int play() { // �������� ���ڰ� ���´�.
		int number = (int) (Math.random() * size) + 1;
		return number;
	}
}

public class DiceGame {
	public static void main(String args[]) {

		DiceGame game = new DiceGame();

		int result1 = game.countSameEye(10);
		System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result1);

	}

	int countSameEye(int n) {

		int count = 0;
		// ����ó��
		try {
			if (n < 0) {
				throw new IllegalArgumentException("�����Ұ�"); // ���ܰ����߻�
			}
			Dice d1 = new Dice(8);
			Dice d2 = new Dice(8);
			for (int i = 1; i <= n; i++) {
				int su1 = d1.play();
				int su2 = d2.play();
				if (su1 == su2) {
					count++;
				}
				System.out.println(su1 + "-------" + su2);
			}

		} catch (IllegalArgumentException aa) { // ���ܸ� ������ ���� ���� ���� ĳġ
			System.out.println(aa.getMessage());
		}
		return count;
	}
}