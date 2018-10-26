package com.encore.day02;

public class Practice2 {

	public static void main(String[] args) {
		//연습하기
		// 윤년의 조건
		// 1. 4의 배수인 해는 윤년이다.
		// 2. 4의 배수이면서 100의 배수인 해는 윤년이 아니다.
		// 3. (필요없는말 :100의 배수이면서) 400의 배수인 해는 윤년이다.
		//year % 4 == 0 && year % 100 != 0 || year % 400 == 0
		
		
		int year = 60;
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("윤년이다");
		}else {
			System.out.println("윤년이 아니다");
		
		
		if (year % 100 == 0 && year % 400 == 0){
			System.out.println("윤년이다");
		}else {
			System.out.println("윤년이 아니다");
			
		
		
		

		}
	}
}