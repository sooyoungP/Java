package com.encore.day04;

public class BookManagement {
	public static void main(String[] args) { // main을 만들면 프로그램을 시작 할 능력이 있는것
		Book b1 = new Book("자바프로그램","박소영",19000);
		Book b2 = new Book("파이썬","임왕기",18000);
		Book b3 = new Book("c++","정진",17000);
		// b4 = new Book();

		//b1.title = "자바프로그램";
		//b1.author = "박소영";
		//b1.price = 19000;
		
		//b2.title = "파이썬";
		//b2.author = "임왕기";
		//b2.price = 18000;
		
		//b3.title = "c++";
		//b3.author = "정진";
		//b3.price = 17000;
		
		b1.BookInfo();
		b2.BookInfo();
		b3.BookInfo();
		
		
	
	}
}
