package com.encore.day06;

public class BookTest {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book("�ڹ��� ����", 25000, "���� ��");
		Book b4 = new Book("�̰��� �ڹٴ�","����â");
		//b1�� �����ϰ� �����ؾ� ����� �����ϴ�.
		
		System.out.println("������� ��"+Book.count +"�� �Դϴ�");
		
		System.out.println(b3.getPrice());
		b2.setPrice(35000);
		System.out.println(b2.getPrice());
		
		
		
		b1.bookInfoPrint();
		b2.bookInfoPrint();
		b3.bookInfoPrint();
		b4.bookInfoPrint();
	}

}
