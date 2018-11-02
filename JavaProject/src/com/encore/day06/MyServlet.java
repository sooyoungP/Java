package com.encore.day06;

public class MyServlet {

	//�̱��� : �ѹ��� new �� �� �ִ�.
	private static MyServlet my;
	
	//1. �ܺο��� ���� �Ұ�, ���� �� �� �ִ� (�Լ��� ���ؼ�)
	private MyServlet() {
		
	}
	
	//2. �ܺο��� �����ϱ� ���� �޼��� ����, �Լ��� ������ �־���Ѵ�.
	public static MyServlet getInstance() {
		if(my==null) my = new MyServlet();
		return my;
	}
}
