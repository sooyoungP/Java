package com.encore.day03;

public class 박소영 {

	public static void main(String[] args) {

		// 과제제출
		int num = 15;
		int total = 0;
		int incre = 1;
		for (int i = 0; i < num; incre = i + incre, i++) {
			total += i + incre;
		}
		System.out.println(total);
	}
	
	}
