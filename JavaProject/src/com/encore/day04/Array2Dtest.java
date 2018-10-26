package com.encore.day04;

public class Array2Dtest {

	public static void main(String[] args) {
		// 1차원 배열
		int[] iarr = new int[10]; // 선언과 생성을 동시에
		int[] iarr2 = new int[] { 10, 20, 30 }; // 선언과 생성, 초기화를 동시에 한다. 대괄호는 생략가능
		int[] iarr3 = { 10, 20, 30 };

		// 2차원 배열 : 배열의 배열
		int[][] arr; // 2차원 배열 선언
		int[] arr2[]; // 2차원 배열 선언
		int arr3[][];
		arr = new int[3][4]; // 3행 4열, arr의 길이는 3이다.
		arr2 = new int[4][];
		arr3 = new int[5][5];

		System.out.println(arr.length);
		System.out.println(arr[0].length); // arr의 0번째 방의 갯수

		System.out.println(arr2.length);
		arr2[0] = new int[23];

		System.out.println(arr2[0].length);
		System.out.println(arr3.length);

		arr[0][0] = 90;
		arr[1][0] = 90;

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(row + "행" + col + "열" + arr[row][col] + "\t");
			}
			System.out.println();
		}

	}
}
