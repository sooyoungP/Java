package com.encore.day04;

public class Book {
	//1. Field (����)
		String title;
		String author;
		int price;
	//2. Constructor(������) -- new �� �� �ڵ�����Ǵ� �޼��� // �������� �Ǵ� ���� �����ε��̶�� �Ѵ�.
		Book(){
			System.out.println("default������--Book�� �����");
		}
		Book(String title, String a, int p){
			this.title = title;
			author = a;
			price = p;
		}
	//3. Method (���)
		public void BookInfo() {
			System.out.println(title);
			System.out.println(author);
			System.out.println(price);
			System.out.println("=======");
		}
	
	
}
