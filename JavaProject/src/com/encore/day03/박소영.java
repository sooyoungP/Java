package com.encore.day03;

public class �ڼҿ� {

	public static void main(String[] args) {

		// ��������
		int num = 15;
		int total = 0;
		int incre = 1;
		for (int i = 0; i < num; incre = i + incre, i++) {
			total += i + incre;
		}
		System.out.println(total);
	}
	
	}
