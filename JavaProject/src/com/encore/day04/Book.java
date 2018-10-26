package com.encore.day04;

public class Book {
	//1. Field (변수)
		String title;
		String author;
		int price;
	//2. Constructor(생성자) -- new 할 때 자동실행되는 메서드 // 여러개가 되는 것을 오버로딩이라고 한다.
		Book(){
			System.out.println("default생성자--Book을 만든다");
		}
		Book(String title, String a, int p){
			this.title = title;
			author = a;
			price = p;
		}
	//3. Method (기능)
		public void BookInfo() {
			System.out.println(title);
			System.out.println(author);
			System.out.println(price);
			System.out.println("=======");
		}
	
	
}
