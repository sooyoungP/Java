package com.encore.day03;

import java.util.Scanner;

public class Review {

	public static void call8() {

		int su = 15;

		for (int i = 1; i <= su; i++) {

			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void call7() {

		int su = 15;

		for (int i = 1; i <= su; i++) {

			for (int j = 1; j <= su + 1 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void call6() {
		for (int i = 1; i <= 10; i++) {
			if (i == 4)
				continue;
			System.out.println(i);
		}
	}

	public static void call5() {// 팩토리얼 풀이법 2
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			int factorial = 1;
			for (int j = i; j > 0; j--) {
				factorial *= j;
			}
			System.out.println(factorial);
		}
	}

	public static void call4() {// 팩토리얼 풀이법 2
		int su = 5;

		for (int num = su; num >= 1; num--) {
			int result = 1;
			System.out.print(num + "!=");
			for (int i = num; i >= 1; i--) {
				System.out.print(i);
				result *= i; // result = result * i (복합 대입 연산자)
				if (i == 1)
					System.out.print("=");
				else
					System.out.print("X");
			}
			System.out.println(result);
		}
	}

	public static void call3() {
		int count = 0;
		int sum = 0;
		for (int i = 7; i <= 100; i = i + 7) {

			System.out.println("i=" + i);
			sum = sum + i;
			count++;
		}
		System.out.println("1~10까지 7의 배수 갯수는" + count);
		System.out.println("1~10까지 7의 배수 합계는" + sum);
	}

	public static void call2() {
		int count = 0;
		int sum = 0;
		for (int i = 0; i <= 100; i = i + 1) {
			if (i % 7 == 0) {
				System.out.println("i=" + i);
				sum = sum + i;
				count++;
			}
			System.out.println("1~10까지 7의 배수 갯수는" + count);
			System.out.println("1~10까지 7의 배수 합계는" + sum);
		}
	}

	public static void call() {
		int sum = 0;
		for (int i = 0; i <= 10; i = i + 2) {
			System.out.println("i=" + i);
			sum = sum + i;
		}
		System.out.println("1~10까지 합계는" + sum);
	}

	public static void main(String[] args) {
		// 1~10까지 출력
		call8();
	}

}
