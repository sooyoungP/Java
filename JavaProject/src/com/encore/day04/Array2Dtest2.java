package com.encore.day04;

public class Array2Dtest2 {

	public static void main(String[] args) {
		int[] score = { 100, 90, 80, 70, 60 };

		// 일반적인 반복문
		for (int i = 0; i < score.length; i++) {
			System.out.println(i + "번째" + score[i]);
		}
		System.out.println("========================");

		// 향상된 반복문
		for (int data : score) {
			System.out.println(data);
		}
		System.out.println("========================");

		// 2차원 배열 (3명의 점수)
		int[][] score2 = new int[][] { { 1, 2, 3, 4, 5 }, { 4, 5, 6 }, { 7, 8 } }; // 3행이다. 행마다 열의 갯수가 다르다.
		// 일반 반복문
		for (int i = 0; i < score2.length; i++) {// score2.length = 3이다
			for (int j = 0; j < score2[i].length; j++) {// score2[i] 이렇게 주면 행마다 다른 열의 길이를 나타낼 수 있다.
				System.out.print(score2[i][j] + "\t");
			}
			System.out.println();
		}
		//완료.이중 for일때는 일반적인 반복문이 좋다.
	}

}
