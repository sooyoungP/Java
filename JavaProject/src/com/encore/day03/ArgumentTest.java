package com.encore.day03;

public class ArgumentTest {

	public static void compute(int start, int end) { //형식매개변수, argument

		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(start + "~~" + end + "까지 합계는: " + sum);
	}

	public static void main(String[] args) {
		compute(1, 10); //실 메개변수 ...실제값
		compute(1, 100);
		compute(1, 1000);
		
		int su1 = 100;
		int su2 = 200;
		
		compute(su1, su2);
	}

}
