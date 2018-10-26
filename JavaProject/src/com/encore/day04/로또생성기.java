package com.encore.day04;

import java.util.Arrays;

public class 로또생성기 {
	public static void call() {
		// 무작위 수 만들기
		double su = Math.random(); // 무작위 수가 발생한다. 0<=su<1사이의 실수가 나온다. 랜덤은 더블값으로 나온다.
		int num = (int) (su * 10);// 1~10사이의 수 //원하는 숫자만큼 곱해준다.
		int num2 = (int) (su * 45) + 1; // 1~45사이의 수(마지막 수를 포함시키고 싶으면 1를 더하면 된다)
		System.out.println(su);
		System.out.println(num);
	}

	public static void call2() {
		// 여섯개의 무작위 수 (1~45사이)
		for (int i = 1; i <= 6; i++) {
			int su = (int) (Math.random() * 45) + 1;
			System.out.println(su);
		}

	}

	public static void call3() {
		int[] happy = new int[6];
		int cnt = 0;
		aa: while (true) {
			if (cnt == 6)break; // 반복을 빠지기

			int su = (int) (Math.random() * 45) + 1;
			// 중복조사
			
			for (int i = cnt - 1; i >= 0; i--) {
				if (su == happy[i])
					continue aa;
			}
			happy[cnt] = su;
			cnt++;
		}
		System.out.println(Arrays.toString(happy));
	}

	public static void main(String[] args) {
		call3();
	}

}
