package com.encore.day06;

public class MyServlet {

	//싱글톤 : 한번만 new 할 수 있다.
	private static MyServlet my;
	
	//1. 외부에서 생성 불가, 나만 쓸 수 있다 (함수를 통해서)
	private MyServlet() {
		
	}
	
	//2. 외부에서 접근하기 위한 메서드 제공, 함수는 리턴이 있어야한다.
	public static MyServlet getInstance() {
		if(my==null) my = new MyServlet();
		return my;
	}
}
