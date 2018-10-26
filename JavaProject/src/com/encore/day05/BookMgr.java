package com.encore.day05;

public class BookMgr {
	Book[] booklist;

	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}

	public void printBookList() {
		System.out.println("=== 책 목록 ===");
		for (Book b : booklist) {
			b.getTitle();
			System.out.println(b.getTitle());
		}
	}

	public void printTotalPrice() {
		System.out.println("=== 책 가격의 총합 ===");
		int sum = 0;
		for (Book b : booklist) {
			sum += b.getPrice();
		}
		System.out.println(sum);
	}
}