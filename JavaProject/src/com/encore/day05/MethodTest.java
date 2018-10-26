package com.encore.day05;

public class MethodTest {

	// �ż���_�����ε� : �ż��� �̸��� ���� �Ű����� ���� ������ �ٸ� �Լ��� ��� �����ϴ�...!!!!!

	public static int sum(int a, int b) { // void�� ���� ���� ���ٴ� ��, ���� ���� �ִٸ� �ش� ���� Ÿ���� void��� �� �ڸ��� �����ش�.
		int c = a + b;
		return c; // return�� �� �ż��带 ȣ���� ������ ���� ������ �ǵ��� ����.
	}

	public static String sum(String a, String b) { // void�� ���� ���� ���ٴ� ��, ���� ���� �ִٸ� �ش� ���� Ÿ���� void��� �� �ڸ��� �����ش�.
		String c = a + b;
		return c; // return�� �� �ż��带 ȣ���� ������ ���� ������ �ǵ��� ����.
	}

	public static String sum(String a, String b, String s) { // void�� ���� ���� ���ٴ� ��, ���� ���� �ִٸ� �ش� ���� Ÿ���� void��� �� �ڸ���
																// �����ش�.
		String c = sum(a, b) + s;
		return c; // return�� �� �ż��带 ȣ���� ������ ���� ������ �ǵ��� ����.
	}

	public static double sum(double a, double b, double s) { // void�� ���� ���� ���ٴ� ��, ���� ���� �ִٸ� �ش� ���� Ÿ���� void��� �� �ڸ���
																// �����ش�.
		double c = a + b + s;
		return c; // return�� �� �ż��带 ȣ���� ������ ���� ������ �ǵ��� ����.
	}

	public static int sum(int... data) {
		System.out.println("��������--�Ű������� ������ �����̴�.");
		int total = 0;
		for (int su : data) {
			total += su;

		}
		return total;

	}
	
	public static int hap(int...is) {
		int total = 0;
		for (int su:is) {
			total +=su;
		}
		return total;
	}

	public static void main(String[] args) {

		int ret = sum(10, 20);
		int ret2 = sum(100, 200);
		System.out.println(ret + ret2);
		System.out.println(sum(ret, ret2));

		String ret3 = sum("���ھ�", "���뿪");
		String ret4 = sum("���ھ�", "���ʿ�");

		System.out.println(ret3);
		System.out.println(ret4);
		System.out.println(ret3 + ret4);

		String ret5 = sum("���ھ�", "���뿪", "���ʿ�");
		System.out.println(ret5);

		double ret6 = sum(1.5, 2.5, 3.5);
		System.out.println(ret6);
		// �ڵ�����ȯ�� �Ǳ� ������ �Ǽ� ��� ������ �־ ������ �ȴ�.

		int ret7 = sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(ret7);
		
		int ret8 = hap(1,5,9,17,56,52);
		System.out.println(ret8);
	}

}
