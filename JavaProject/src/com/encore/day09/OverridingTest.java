package com.encore.day09;

public class OverridingTest {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		String s1 = "30";

		MySum ms1 = new MySum(i, j);
		MySum ms2 = new MySum(i, j);

		System.out.println(ms1.toString());
		System.out.println(ms2); //�ڵ����� toString()�� ȣ��ȴ�.
		//���ϴ� ������ ����Ϸ��� toString�� ������ �ؾ��Ѵ�.

		if (ms1.equals(ms2)) {
			System.out.println("ms1�� ms2�� �հ�� �����մϴ�.");
		}
		if (ms1.toString() == s1 ) {
			System.out.println("ms1�� s1�� �����մϴ�.");
		} else {
			System.out.println("ms1�� s1�� �������� �ʽ��ϴ�.");
		}
	}
}
