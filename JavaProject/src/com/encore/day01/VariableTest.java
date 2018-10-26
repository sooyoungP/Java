package com.encore.day01;

public class VariableTest {
	
	
	// test 메서드 정의; 테스트는 내가 불러야 호출된다.
	public static void test( ) {
		int score = 300;
		System.out.println(score+500);
	}
	
	// main 메서드 정의; 메인은 자바 가상머신이 알아서 불러온다.
	public static void main(String[] args) {
		System.out.println("메인이 시작!");
		
		test(); //호출...갔다가 반드시 돌아온다.
		test(); //여러번 부를 수 있다.
		
		//1. 변수할당
		int score;
		//2. 변수에 값을 할당
		score = 100;
		//3. 변수사용
		System.out.println(score);
		
		//선언과 할당을 같이
		int score2 = 200;
		int total = score + score2;
			
		System.out.println(score2);
		
		System.out.println(total);
		
		//리터럴
		byte b = 127; //1byte
		short s = 32767; //2byte
		int i = 2147483647; //4byte
		long lo = 2147483648L; //8byte
		float f = 3.14f; //4byte
		double d = 3.14; //8byte
		boolean bb = 1 > 2; //false
		char c ='가'; //한글자만 가능
		String str = "자바";
		System.out.println(bb);
		System.out.println(str);
		
		System.out.println("메인이 끝!");
		

	}

}
