package com.encore.day05;

public class MethodTest {

	// 매서드_오버로딩 : 매서드 이름은 같고 매개변수 사양과 리턴이 다른 함수를 사용 가능하다...!!!!!

	public static int sum(int a, int b) { // void는 리턴 값이 없다는 뜻, 리턴 값이 있다면 해당 값의 타입을 void대신 그 자리에 적어준다.
		int c = a + b;
		return c; // return은 이 매서드를 호출한 곳으로 값을 가지고 되돌아 간다.
	}

	public static String sum(String a, String b) { // void는 리턴 값이 없다는 뜻, 리턴 값이 있다면 해당 값의 타입을 void대신 그 자리에 적어준다.
		String c = a + b;
		return c; // return은 이 매서드를 호출한 곳으로 값을 가지고 되돌아 간다.
	}

	public static String sum(String a, String b, String s) { // void는 리턴 값이 없다는 뜻, 리턴 값이 있다면 해당 값의 타입을 void대신 그 자리에
																// 적어준다.
		String c = sum(a, b) + s;
		return c; // return은 이 매서드를 호출한 곳으로 값을 가지고 되돌아 간다.
	}

	public static double sum(double a, double b, double s) { // void는 리턴 값이 없다는 뜻, 리턴 값이 있다면 해당 값의 타입을 void대신 그 자리에
																// 적어준다.
		double c = a + b + s;
		return c; // return은 이 매서드를 호출한 곳으로 값을 가지고 되돌아 간다.
	}

	public static int sum(int... data) {
		System.out.println("가변인자--매개변수의 갯수가 가변이다.");
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

		String ret3 = sum("엔코아", "교대역");
		String ret4 = sum("엔코아", "서초역");

		System.out.println(ret3);
		System.out.println(ret4);
		System.out.println(ret3 + ret4);

		String ret5 = sum("엔코아", "교대역", "서초역");
		System.out.println(ret5);

		double ret6 = sum(1.5, 2.5, 3.5);
		System.out.println(ret6);
		// 자동형변환이 되기 때문에 실수 대신 정수를 넣어도 실행이 된다.

		int ret7 = sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(ret7);
		
		int ret8 = hap(1,5,9,17,56,52);
		System.out.println(ret8);
	}

}
