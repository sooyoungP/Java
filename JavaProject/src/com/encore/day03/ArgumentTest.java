package com.encore.day03;

public class ArgumentTest {

	public static void compute(int start, int end) { //���ĸŰ�����, argument

		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(start + "~~" + end + "���� �հ��: " + sum);
	}

	public static void main(String[] args) {
		compute(1, 10); //�� �ް����� ...������
		compute(1, 100);
		compute(1, 1000);
		
		int su1 = 100;
		int su2 = 200;
		
		compute(su1, su2);
	}

}
