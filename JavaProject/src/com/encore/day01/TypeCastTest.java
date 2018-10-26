package com.encore.day01;

public class TypeCastTest {

	public static void main(String[] args) {
		// 1. 자동형변환
		
		byte by = 100; //가장 큰 바이트는 127
		int i = 200;
		
		// byte < short(2) < int(4),정수일 때 기본값 < long(8) < float(4) < double(8),소수일 때 기본값
		//		  char(2) >> char는 음수가 없기때문에 short와 크기는 같아도 변환은 안된다.
		i = by;
		System.out.println("byte를 int로 변경:"+i); //문자 + 숫자 는 문자
		
		// 2. 강제형변환 가능, 그러나 데이터 손실 가능성 있음
		by = (byte)i;
		System.out.println("in를 byte로 변경:" + by);
		// 2-1. 강제형변환을 통해 데이터 손실이 발생한 경우이다.
		double d = 3.14; //실수 데이터
		//d = 1;
		int i2 = (int)d;
		System.out.println(i2); //int는 정수인데 float타입을 넣어서 데이터 손실이 발생했다. 
		System.out.println(d); //원래 데이터는 그대로 있다.
		
		//연습
		//작은 쪽이 큰방으로 가면 자동 형변환
		
		int sy = 44031;
		char syp = 'A';
		
		//자동
		sy = syp;
		System.out.println("자동변환:"+sy);
		//강제
		sy++;
		System.out.println("결과는?:"+sy);
		syp = (char)sy;
		System.out.println("강제형변환:"+syp);
		
		
		//연습하기
		
		int sysy = 13;
		sysy++;
		System.out.println(sysy);
		System.out.println(sysy++);
		System.out.println(sysy);
		System.out.println(++sysy);
		
		sysy--;
		System.out.println(sysy);
		System.out.println(sysy--);
		System.out.println(sysy);
		System.out.println(--sysy);
		
		//서로다른 연산자 더하기
		
		int a = 100;
		double b = 3.14;
		
		//double result = a+b;
		//System.out.println(result); // int가 자동으로 double로 변환한다. 결국 작은타입이 큰타입으로 자동 형변환
		
		int result = (int)(a+b);
		System.out.println(result); // 강제형변환을 해줘야 큰타입이 작은타입으로 이동한다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

	}

}
