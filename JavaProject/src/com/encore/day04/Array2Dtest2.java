package com.encore.day04;

public class Array2Dtest2 {

	public static void main(String[] args) {
		int[] score = { 100, 90, 80, 70, 60 };

		// �Ϲ����� �ݺ���
		for (int i = 0; i < score.length; i++) {
			System.out.println(i + "��°" + score[i]);
		}
		System.out.println("========================");

		// ���� �ݺ���
		for (int data : score) {
			System.out.println(data);
		}
		System.out.println("========================");

		// 2���� �迭 (3���� ����)
		int[][] score2 = new int[][] { { 1, 2, 3, 4, 5 }, { 4, 5, 6 }, { 7, 8 } }; // 3���̴�. �ึ�� ���� ������ �ٸ���.
		// �Ϲ� �ݺ���
		for (int i = 0; i < score2.length; i++) {// score2.length = 3�̴�
			for (int j = 0; j < score2[i].length; j++) {// score2[i] �̷��� �ָ� �ึ�� �ٸ� ���� ���̸� ��Ÿ�� �� �ִ�.
				System.out.print(score2[i][j] + "\t");
			}
			System.out.println();
		}
		//�Ϸ�.���� for�϶��� �Ϲ����� �ݺ����� ����.
	}

}
