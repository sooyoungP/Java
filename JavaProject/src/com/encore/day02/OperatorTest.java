package com.encore.day02;

public class OperatorTest {


	// 메서드 정의
	public static void method() {
		System.out.println("메서드 시작");
		int a = 10;
		a++; //1증가시에 주로 사용된다.
		a = a + 1;
		a += 1; // 특정 숫자만큼 증가할 때
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println("메서드 끝");
	}

	public static void method2() { // 메서드이름은 중복되면 안된다.
		System.out.println("===========메서드2 시작============");
		int score = 95;
		//90이상이면 A학점, 그렇지 않으면 B학점을 주고 싶다.
		String grade;
		grade = score > 90 ? "A학점" : "B학점";
		System.out.println(grade);
		System.out.println(score > 90 ? "A학점" : "B학점");
		
		if(score>90) {
			grade = "A학점";
		}else {
			grade ="B학점";
		}
		System.out.println(grade);
		System.out.println("=============메서드2 끝===========");
	}

	// 메서드 정의...main은 JVM이 호출한다.
	public static void main(String[] args) {

		// 메서드 호출...갔다가 돌아온다.
		method();
		method2();

		System.out.println("메인이 시작");

		System.out.println(10 > 20);
		System.out.println(!(10 > 20));

		System.out.println("메인이 끝");

	}
}
