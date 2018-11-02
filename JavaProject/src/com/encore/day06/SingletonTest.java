package com.encore.day06;

public class SingletonTest {

	public static void main(String[] args) {
		// Myservlet aa = new Myservlet(); private상태여서 만들 수 없다.

		MyServlet aa = MyServlet.getInstance();
		MyServlet bb = MyServlet.getInstance();

		System.out.println(aa == bb);
		System.out.println(aa);
		System.out.println(bb); // 한번만 생성되기 때문에 주소가 같다.

	}

}
