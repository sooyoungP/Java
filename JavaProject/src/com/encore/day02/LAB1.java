package com.encore.day02;

import java.util.Scanner;

public class LAB1 {

	public static void main(String[] args) {
		// 문제1
		Scanner sc = new Scanner(System.in);
		System.out.println("1보다 크고 10보다 작은 정수를 입력하세요. :");
		int su = sc.nextInt();
		if (su <=1 || su >= 10) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
			sc.close();
		}else {
			for (int gop =1; gop<=9; gop++) {
				System.out.printf("%dx%d=%d\n", su, gop, su*gop);
			}

		}
	}
}