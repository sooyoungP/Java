package com.encore.day06;

import java.net.Proxy.Type;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class test {

	public static void main(String[] args) {
		//test4_15();
		
	}
	
	public static void test4_15() {
		int number = 12321;
		int tmp = number;
		
		int result = 0;
		
		while(tmp !=0) {
			
		}
		if(number == result) {
			System.out.println( number + "�� ȸ���� �Դϴ�.");
		}else {
			System.out.println( number +"�� ȸ������ �ƴմϴ�");
		}
	}

	public static void test4_14() {

		int answer = (int) (Math.random() * 100 + 1);
		int input = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		do {
			count++;
			System.out.println("1�� 100������ ���� �Է��Ͻÿ� :");
			input = sc.nextInt();
			if (input < answer) {
				System.out.println("�� ū ���� �Է��ϼ���");
			} else if (input > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			} else {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ����" + count + "���Դϴ�.");
				break;
			}

		} while (true);
	}

	public static void test4_13() {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;

		for (int i = 0; i < value.length(); i++) {
			ch = value.charAt(i);

			if (isNumber) {
				System.out.println(value + "�� �����Դϴ�.");
			} else {
				System.out.println(value + "�� ���ڰ� �ƴմϴ�.");
			}
		}
	}

	public static void test4_12() {

		for (int i = 1; i <= 3; i++) {
			for (int j = 2; j <= 4; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 3; i++) {
			for (int j = 5; j <= 7; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 3; i++) {
			for (int j = 8; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}

	}

	public static void test4_10() {
		int num = 12345;
		int sum = 0;

		String num1 = String.valueOf(num);
		for (int i = 0; i < num1.length(); i++) {
			sum = sum + Integer.parseInt(num1.charAt(i) + "");
		}
		System.out.println(sum);

	}

	public static void test4_9() {

		String str = "12345";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			sum = sum + Integer.parseInt(str.charAt(i) + "");
		}
		System.out.println(sum);

	}

	public static void test4_8() {

		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if (2 * i + 4 * j == 10) {
					System.out.println("x=" + i + ", " + "y=" + j);
				}
			}
		}

	}

	public static void test4_6() {
		for (int i = 1; i < 6; i++) {
			for (int j = 6; j >= 1; j--) // System.out.println(i + "," + (6-i)); �ٸ� Ǯ�̹�
				if (i + j == 6) {
					System.out.println(i + "," + j);
				}
		}

	}

	public static void test4_5() {
		int i = 0;
		while (i <= 10) {
			int j = 0;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}

	public static void test4_4() {
		int total = 0;
		int i = 0;
		while (true) {

			i++;
			if (i % 2 == 0) {
				i = i * (-1);
			} else {

			}
			total = total + i;
		}
		System.out.println(i);
		System.out.println(total);

	}

	public static void test4_3() {
		// [4-3]
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				total += j;
			}
			System.out.println(total);
		}
	}

}
