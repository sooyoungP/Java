package com.encore.day05;

public class Book {
	private String title;
	private int price;
	
	
	//setter,getter �ż���
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	
}	


