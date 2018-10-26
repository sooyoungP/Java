package com.encore.day02;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 어떤 수가 7의 배수인가요?
		
		int count = 0; //카운트라는 변수:: 갯수를 세기위해서 변수 선언
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {//true값을 넣으면 무한으로 돈다.
		System.out.print("숫자를 입력하세요:");
		int su =sc.nextInt();
		if(su == -1) break;
		String message;
		if (su % 7 == 0) {
			count++;
			message = "7의 배수입니다";
		} else {
			message = "7의 배수가 아닙니다";
		}
		System.out.println(message);
		}
		System.out.println("지금까지 입력한 7의배수는" + count +"개 입니다.");
	}
	
}
