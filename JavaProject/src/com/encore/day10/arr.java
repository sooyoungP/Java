package com.encore.day10;

import java.util.Arrays;
import java.util.Comparator;

public class arr implements Comparator<Integer>{
	

	public static void main(String[] args) {

		int[] arr = { 5, 1, 87, 19, 6, 25, 64 };
		compare()
		System.out.println("sort전 : " + Arrays.toString(arr)); // Arrays.toString를 사용하면 배열을 문자열로 바꿔서 출력해주는 매서드 사용

		Arrays.sort(arr);// Ascending 기본값(오름차순)

		System.out.println("sort후 : " + Arrays.toString(arr));
		
		

	}

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return 0;
	}


}
