package com.encore.day09;

import java.util.Arrays;

public class SortTest {

	public static void call() {
		int[] arr = { 11, 4, 17, 23, 99, 144 };

		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void call2() {
		String[] arr = { "자바", "파이썬", "자바스크립트", "하둡", "하이브", "제플린" };

		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); // 기본으로 오름차순
		System.out.println(Arrays.toString(arr));

		// 반대로 내림차순 하고 싶을 때 새로 DecscendingSort를 만든다. 기본은 오름차순이 설정되어있기때문에 재정의 필요
		Arrays.sort(arr, DescendingSort());
		System.out.println(Arrays.toString(arr));
	}

	public static void call3() {
		Coffee[] arr = { new Coffee("아메리카노1", 1000, 'S'), new Coffee("아메리카노5", 5000, 'S'),
				new Coffee("아메리카노2", 2000, 'S'), new Coffee("아메리카노4", 4000, 'S'), new Coffee("아메리카노3", 3000, 'S') };

		System.out.println("before:" + Arrays.toString(arr));
		Arrays.sort(arr); // 기본으로 오름차순
		System.out.println("before:" + Arrays.toString(arr));

		Arrays.sort(arr, new CoffeeComparator()); // 조건이 새롭게 정의 된 것을 불러와서 새롭게 정렬한다.
		System.out.println("이름순:" + Arrays.toString(arr));

	}

	public static void main(String[] args) {
		call3();
	}
}
