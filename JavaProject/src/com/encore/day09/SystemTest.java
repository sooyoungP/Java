package com.encore.day09;

import java.util.Date;

public class SystemTest {

	public static void main(String[] args) {
		//long a = System.currentTimeMillis();
		long a = System.nanoTime();
		System.out.println(a);
		Date d = new Date(a);
		System.out.println(d);

		
		for(int i = 0; i <100000000; i++) {}
		
		//long b = System.currentTimeMillis();
		long b = System.nanoTime();
		System.out.println((b-a)+"나노타임 소요됨");
	}

}
