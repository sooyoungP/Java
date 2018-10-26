package com.encore.day05;

public class BookMgr {
	Book[] booklist;

	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}

	public void printBookList() {
		System.out.println("=== å ��� ===");
		for (Book b : booklist) {
			b.getTitle();
			System.out.println(b.getTitle());
		}
	}

	public void printTotalPrice() {
		System.out.println("=== å ������ ���� ===");
		int sum = 0;
		for (Book b : booklist) {
			sum += b.getPrice();
		}
		System.out.println(sum);
	}
}