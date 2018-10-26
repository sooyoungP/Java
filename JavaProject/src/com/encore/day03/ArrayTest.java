package com.encore.day03;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		call5();
	}
	public static void call5() {
		//시험 본 과목의 갯수를 입력하세요. 점수입력 총점 평균
		Scanner sc = new Scanner(System.in);
		System.out.print("시험 본 과목의 갯수를 입력하세요: ");
		int count = sc.nextInt();
		int[] score =new int[count];
		System.out.print("점수를 입력하세요: ");
		int total =0;
		for(int i=0; i<count; i++) {
			score[i] = sc.nextInt();
			total += score[i];
		}
		System.out.println("총점:"+total);
		System.out.println("평균:"+total/count);
	}

	public static void call4() {
		// 사용자에게 친구 이름을 입력받자.
		Scanner sc = new Scanner(System.in);
		String[] friend;

		System.out.print("친한 친구 몇명이야?: ");
		int bf = sc.nextInt();
		friend = new String[bf]; // null로 초기화가 된다.
		System.out.print("친구이름을 입력하세요: ");
		for (int i = 0; i < bf; bf++) {
			friend[i] = sc.next();
			System.out.println(friend[i] + "님이랑 친하시군요");
		}
		for (int i = 0; i < bf; bf++) {
			System.out.println(friend[i] + "주소록에 저장되어있음");
		}
		sc.close();

	}

	public static void call3() {
		// 이름 여러명을 저장한다.
		String[] friend = { "임왕기", "박소영", "친구1", "친구2" };

		for (int i = 0; i < friend.length; i++) {
			System.out.println(friend[i] + "밥먹자");
		}
	}

	public static void call2() {
		// 점수 5개를 저장하라
		int[] score;
		score = new int[] { 80, 90, 85, 98, 100 };
		// int[] score = new int[5]; 위의 2줄과 같은 의미

		double total = 0;
		double avg;

		for (int i = 0; i < score.length; i++) {
			total = total + score[i];
		}
		System.out.println("총점은" + total);
		avg = total / score.length;
		System.out.println("평균은" + avg);
	}

	public static void call() {
		// 배열 : 동일한 이름으로 동일한 타입의 여러개의 값을 연속공간에 저장하기 위한 자료구조.
		// 1. 배열 변수 선언
		int[] score; // 더 선호한다. int score2[];둘다 사용가능
		char[] carr;

		// 2. 배열 생성(new)....자동 초기화가 된다. 타입이 int이면 0으로 자동 초기화가 된다.
		score = new int[10];
		carr = new char[5]; // 자동 초기화 완료. ''공백으로 초기화가 된다.
		// 3. 배열 사용
		System.out.println(score[0]);
		System.out.println(score[9]);
		System.out.println("갯수:" + score.length); // 좋은점 : 반복문에서 사용하기 좋다.

		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		for (int i = 0; i < carr.length; i++) {
			System.out.println("char타입:" + i + "번쨰" + carr[i] + "*");
		}
		// 선언과 생성
		boolean[] barr = new boolean[5];

		for (int z = 0; z < barr.length; z++) {
			System.out.println("boolean타입:" + z + "번째" + carr[z] + "*");
		}

		// 선언 + 생성+ 할당
		// String[] str = new string[] {"커피","우유","밥"};
		String[] str = { "커피", "우유", "밥" };
		for (int k = 0; k < str.length; k++) {
			System.out.println(str[k]);
		}

	}
}
