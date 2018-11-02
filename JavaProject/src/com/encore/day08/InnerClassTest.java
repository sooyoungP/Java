package com.encore.day08;

public class InnerClassTest {

	
	class OuterClass {
		int a =10; // 인스턴스 변수
		static int b = 20; // 스테틱 변수
		
			//인스턴스 이너 클래스
			class InnerClassA{
				int c = 30;
				int d = 40; //인스턴스 클래스 안에서는 스테틱 변수 생성 불가능
				}
			//스테틱 이너 클래스
			class InnerClassB{
				int e = 50;
				static int f = 60;
				}	
		
		public void print() {
			int g = 70; //지역변수(매서드 안에있는 변수)

		}
		
	}
	public static void main(String[] args) {
		OuterClass var1 = new OuterClass();
		System.out.println(var1.a);
		System.out.println(OuterClass.b); //스테틱 변수이기 때문에 객체 생성을 안해도 된다.
		
		//이너클래스는 아웃클래스를 new하고 다시new해야 사용가능하다.
		OuterClass.InnerClassA var2 = new OuterClass().new InnerClassA();
		System.out.println(var2.c);
		
		OuterClass.InnerClassB var2 = new OuterClass.InnerClassB();
		System.out.println(var3.e);
		System.out.println(OuterClass.InnerClassB.f);
	}

}
