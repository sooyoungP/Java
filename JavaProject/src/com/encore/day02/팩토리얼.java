package com.encore.day02;

import java.util.Scanner;

public class 팩토리얼 {

	public static void main(String[] args) {
		// 팩토리얼 연습문제

		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 9보다 작은 숫자를 입력하세요: ");
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
