package com.encore.day04;

public class Array2Dtest {

	public static void main(String[] args) {
		// 1���� �迭
		int[] iarr = new int[10]; // ����� ������ ���ÿ�
		int[] iarr2 = new int[] { 10, 20, 30 }; // ����� ����, �ʱ�ȭ�� ���ÿ� �Ѵ�. ���ȣ�� ��������
		int[] iarr3 = { 10, 20, 30 };

		// 2���� �迭 : �迭�� �迭
		int[][] arr; // 2���� �迭 ����
		int[] arr2[]; // 2���� �迭 ����
		int arr3[][];
		arr = new int[3][4]; // 3�� 4��, arr�� ���̴� 3�̴�.
		arr2 = new int[4][];
		arr3 = new int[5][5];

		System.out.println(arr.length);
		System.out.println(arr[0].length); // arr�� 0��° ���� ����

		System.out.println(arr2.length);
		arr2[0] = new int[23];

		System.out.println(arr2[0].length);
		System.out.println(arr3.length);

		arr[0][0] = 90;
		arr[1][0] = 90;

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(row + "��" + col + "��" + arr[row][col] + "\t");
			}
			System.out.println();
		}

	}
}
