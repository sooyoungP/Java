package com.encore.day10;

import java.util.Arrays;
import java.util.Comparator;

public class arr implements Comparator<Integer>{
	

	public static void main(String[] args) {

		int[] arr = { 5, 1, 87, 19, 6, 25, 64 };
		compare()
		System.out.println("sort�� : " + Arrays.toString(arr)); // Arrays.toString�� ����ϸ� �迭�� ���ڿ��� �ٲ㼭 ������ִ� �ż��� ���

		Arrays.sort(arr);// Ascending �⺻��(��������)

		System.out.println("sort�� : " + Arrays.toString(arr));
		
		

	}

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return 0;
	}


}
