package com.encore.day08;

public class MyException extends Exception {

	
	public MyException(String msg){
		super(msg); //�̹� ����� �ֱ� ������ super�� ���� �ȴ�.
	}
	
	public void print() {
		System.out.println("���� �����Դϴ�.");
	}
	
}
