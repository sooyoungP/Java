package com.encore.day04;

public class ProductProgram {

	public static void main(String[] args) {
		Product a1 = new Product("1234", "aos", 169000, true);
		Product a2 = new Product("2345", "bos", 269000, false);
		Product a3 = new Product("3456", "cos", 369000, true);
		Product a4 = new Product("4567", "dos", 469000, false);
		Product a5 = new Product("7896",54856);
		
		a4.print();
	}

}
