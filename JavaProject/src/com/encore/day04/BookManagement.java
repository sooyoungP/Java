package com.encore.day04;

public class BookManagement {
	public static void main(String[] args) { // main�� ����� ���α׷��� ���� �� �ɷ��� �ִ°�
		Book b1 = new Book("�ڹ����α׷�","�ڼҿ�",19000);
		Book b2 = new Book("���̽�","�ӿձ�",18000);
		Book b3 = new Book("c++","����",17000);
		// b4 = new Book();

		//b1.title = "�ڹ����α׷�";
		//b1.author = "�ڼҿ�";
		//b1.price = 19000;
		
		//b2.title = "���̽�";
		//b2.author = "�ӿձ�";
		//b2.price = 18000;
		
		//b3.title = "c++";
		//b3.author = "����";
		//b3.price = 17000;
		
		b1.BookInfo();
		b2.BookInfo();
		b3.BookInfo();
		
		
	
	}
}
