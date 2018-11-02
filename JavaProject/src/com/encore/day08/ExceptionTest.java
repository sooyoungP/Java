package com.encore.day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//런타임익셉션
public class ExceptionTest {

	public static void call(int a, int b) {

		try {
			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			System.out.println(a / b);// 실행해보면 0으로 나누면 안되기 때문에 exception이 나고 프로그램이 정지된다.
		} catch (ArithmeticException e) {
			// 예외가 발생하면 자동으로 new exception이라는 객체가 만들어져서 다시 돌려준다.
			// ArithmeticException은 runtimeException을 상속받았고, 그것은 Exception을 상속받았다.
			// 오류가 발생해도 프로그램이 종료되지 않고 정상적으로 흘러간다.
			System.out.println("연산오류 by zero.....");
		} finally {
			System.out.println("예외발생 여부와 상관없이 무조건 처리된다");
		}
		System.out.println("메서드가 종료");
	}

	public static void call2() {
		int[] arr = new int[2];

		try {
			arr[0] = 100;
			arr[1] = 30;
			System.out.println(arr[0] / arr[1]);

			Shape s = new Rectangle(3, 4);
			RectTriangle r = (RectTriangle) s;

		} catch (NullPointerException e) {
			System.out.println("배열이 생성되지 않음");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index범위 벗어남");
		} catch (ArithmeticException e) {
			System.out.println("/ by zero");
		} catch (ClassCastException e) {
			System.out.println("ClassCastException.......");
		} catch (Exception e) {
			System.out.println(" 기타  Exception.......");
		}

	}

	public static void call3() {
		// 컴파일시에 해결을 반드시 해야하는 exception...RuntimeException이외
		try {
			Class cc = Class.forName("com.encore.day08.Rectangle2");
			System.out.println(cc.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("반드시 해야하는 코드:자원반납");
		}
		System.out.println("method 끝");
	}

	public static void call4() {
		try { //예외처리를 하면 프로그램이 중지되지 않는다.
		int result = 10/0;
		}catch(Exception aa) {
			
		}
	}
	
	public static void call5() throws IOException { //던지면 불렀던 곳으로 돌아간다.
		FileInputStream fi = new FileInputStream("src/com/encore/day08/Rectangle.java");
		//InputStream이 들어가면 한바이트씩 읽는다.
		int i;
		
		while((i = fi.read())!=-1){ //값이 -1이면 끝까지 다 읽은것
		System.out.print((char)i);
	}
		fi.close();
	}

	public static void main(String[] args) {
		System.out.println("=========메인이 시작=========");
		// call(10, 2); // 컴파일 타임에서는 에러가 나지 않는다. 이것을 런타임이셉션이라고 한다.
		
		try {
			call5();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		call2();
		System.out.println("=========메인이 끝=========");

	}

}
