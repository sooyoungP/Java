package com.encore.day02;

import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 윤년의 조건
		// 1. 4의 배수인 해는 윤년이다.
		// 2. 4의 배수이면서 100의 배수인 해는 윤년이 아니다.
		// 3. 100의 배수이면서 400의 배수인 해는 윤년이다.
		//year % 4 == 0 && year % 100 != 0 || year % 400 == 0

		while (true) {
			System.out.print("연도를 입력하세요: ");
			int year = sc.nextInt();
			
			if(year < 0) {
				System.out.println("연도는 음수가 불가능합니다");
				break;
			}
			
			System.out.print("월을 입력하세요: ");
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
				message = "말일은 31일 입니다";
				break;
			case 2:
				// !(1)&&(2)||(3)
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					message = "말일이 29일(윤년)입니다.";
				} else {
					message = "말일이 28일(평년)입니다.";

				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				message = "말일은 30일 입니다";
				break;
			default:
				message = "월 입력이 잘못되었습니다.";
			}

			System.out.println("오늘은 " + year + "년도 " + month + "월 " + message);
		}
		
		sc.close();
		
		System.out.println("종료되었습니다");
	}

}
