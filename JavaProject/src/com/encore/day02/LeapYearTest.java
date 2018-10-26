package com.encore.day02;

import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ������ ����
		// 1. 4�� ����� �ش� �����̴�.
		// 2. 4�� ����̸鼭 100�� ����� �ش� ������ �ƴϴ�.
		// 3. 100�� ����̸鼭 400�� ����� �ش� �����̴�.
		//year % 4 == 0 && year % 100 != 0 || year % 400 == 0

		while (true) {
			System.out.print("������ �Է��ϼ���: ");
			int year = sc.nextInt();
			
			if(year < 0) {
				System.out.println("������ ������ �Ұ����մϴ�");
				break;
			}
			
			System.out.print("���� �Է��ϼ���: ");
			int month = sc.nextInt();
			String message;

			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				message = "������ 31�� �Դϴ�";
				break;
			case 2:
				// !(1)&&(2)||(3)
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					message = "������ 29��(����)�Դϴ�.";
				} else {
					message = "������ 28��(���)�Դϴ�.";

				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				message = "������ 30�� �Դϴ�";
				break;
			default:
				message = "�� �Է��� �߸��Ǿ����ϴ�.";
			}

			System.out.println("������ " + year + "�⵵ " + month + "�� " + message);
		}
		
		sc.close();
		
		System.out.println("����Ǿ����ϴ�");
	}

}
