package com.encore.day08;

public class MyException extends Exception {

	
	public MyException(String msg){
		super(msg); //이미 기능이 있기 때문에 super를 쓰면 된다.
	}
	
	public void print() {
		System.out.println("나의 예외입니다.");
	}
	
}
