package com.encore.day01;

public class OperatorTest {
	
	public static void test() {
		int a =10;
		int b =20;
		
		boolean result = a == 10 && b ==20; 
		//&&는 앞의 결과가 False이면 뒤의 문장을 수행하지 않는다.
		//||는 앞의 결과가 true이면 뒤의 문장을 수행하지 않는다.
		System.out.println(result);
	}
	public static void main(String[] args) {
		
		test();
		System.out.println("================================");
		
		//1.단항연산자
		int i = 100;
		i++;
		i++;
		++i;
		System.out.println("i="+i);
		
		int i2 = 200;
		int result = i++ + i2++; //++i는 먼저 1 더하고 연산
		System.out.println(result); // i++는 연산하고 나서 나중에 더하기 1
		System.out.println(i);
		System.out.println(i2);
		
		System.out.println("단한연산자 끝");
		
		//2.산술연산자(2항연산자)
		int c = 10;
		int d = 3;
		System.out.println("더하기"+(c+d)); // 문자 더하기 숫자는 문자이다. 그래서 +의 의미는 연결이다.
		System.out.println("빼기"+(c-d));
		System.out.println("곱하기"+c*d);
		System.out.println("나누기"+c/d); //몫
		System.out.println("나머지"+c%d); //%의 의미는 나눈 나머지
		
		//3.비교연산자, 관계연산자
		System.out.println(c > d);
		System.out.println(c <= d);
		
		//4.논리연산자 : &&(and), ||(or), !(not)
		System.out.println(!(c > d));
		System.out.println(!(c <= d));
		
		String subject = null; // 아직 값이 정의된 바는 없습니다.라고 초기화를 시키는 것입니다. 일단 사용이 가능하게 하기 위해서
		
		
		System.out.println(subject != null && subject.length() > 10); //단축구문 : 앞이 틀리면 뒤에 하지 않는다. (null은 길이가 없다)
		System.out.println(subject != null || subject.length() > 10); //앞에가 맞으면 뒤의 영향을 받지 않는다. 
		//System.out.println(subject != null & subject.length() > 10); // 앞이 맞던 틀리던 뒤에 확인을 한다.
		
		//System.out.println(subject == null);
		//System.out.println(subject.length());
		//System.out.println(subject.length() > 10);

	}

}
