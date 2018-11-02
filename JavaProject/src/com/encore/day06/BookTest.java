package com.encore.day06;

public class BookTest {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book("자바의 정석", 25000, "남궁 성");
		Book b4 = new Book("이것이 자바다","정인창");
		//b1은 선언하고 생성해야 사용이 가능하다.
		
		System.out.println("현재까지 총"+Book.count +"권 입니다");
		
		System.out.println(b3.getPrice());
		b2.setPrice(35000);
		System.out.println(b2.getPrice());
		
		
		
		b1.bookInfoPrint();
		b2.bookInfoPrint();
		b3.bookInfoPrint();
		b4.bookInfoPrint();
	}

}
