package com.encore.day03;

public class LAB {

	public static int multiple(int su) {
		//1-100������ 7�� ������� �հ谡 �󸶾�?
		int sum = 0;
		for (int i = 0; i<=100; i+=su) {
			sum += i;
		}
			//System.out.println(su +"�ǹ������ �հ��:"+sum);
		return sum;
	}

	public static void gad(int su1, int su2) { // ������
		int min = su1 > su2 ? su2 : su1;
		int i = min;
		for (; i >= 1; i--) {
			if (su1 % i == 0 && su2 % i == 0)
				break;
		}
		System.out.println(i);
	}

	public static void gcd(int fir, int sec) { // �ҿ�
		int i;
		if (fir > sec) {
			for (i = sec; sec >= 1; sec--) {
				if (fir % i == 0 && sec % i == 0)
					continue;
			}
			System.out.println(i);
		} else {
			for (i = fir; fir >= 1; fir--) {
				if (sec % i == 0 && fir % i == 0)
					continue;
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		//int result = multiple(7);
		//System.out.println(result);

		gcd(2,5);
		gcd(5,15);
		gcd(250,30);

	}

}
