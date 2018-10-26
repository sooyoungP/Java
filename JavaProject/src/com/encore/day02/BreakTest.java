package com.encore.day02;

public class BreakTest {
	public static void main(String[] args) {
		//break : switch 빠져나갈 때 / 반복 문장을 빠져나갈 때 사용한다.
		
		int count = 0;
		
		while (true) {
			System.out.println("배고파");
			count++;
			if (count == 10) break; 
			System.out.println("========");
		}

	}
}
