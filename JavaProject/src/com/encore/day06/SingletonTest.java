package com.encore.day06;

public class SingletonTest {

	public static void main(String[] args) {
		// Myservlet aa = new Myservlet(); private���¿��� ���� �� ����.

		MyServlet aa = MyServlet.getInstance();
		MyServlet bb = MyServlet.getInstance();

		System.out.println(aa == bb);
		System.out.println(aa);
		System.out.println(bb); // �ѹ��� �����Ǳ� ������ �ּҰ� ����.

	}

}
