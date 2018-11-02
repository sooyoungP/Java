package com.encore.day09;

public class OverridingTest {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		String s1 = "30";

		MySum ms1 = new MySum(i, j);
		MySum ms2 = new MySum(i, j);

		System.out.println(ms1.toString());
		System.out.println(ms2); //자동으로 toString()이 호출된다.
		//원하는 값으로 출력하려면 toString을 재정의 해야한다.

		if (ms1.equals(ms2)) {
			System.out.println("ms1과 ms2의 합계는 동일합니다.");
		}
		if (ms1.toString() == s1 ) {
			System.out.println("ms1과 s1는 동일합니다.");
		} else {
			System.out.println("ms1과 s1는 동일하지 않습니다.");
		}
	}
}
