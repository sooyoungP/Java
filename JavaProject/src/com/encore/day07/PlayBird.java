package com.encore.day07;

public class PlayBird {

	public static void main(String[] args) {
		Duck a = new Duck("�в���",2,10);
		Sparrow b = new Sparrow("±±��",2,5);
		
		a.fly();
		a.sing();
		System.out.println(a);
		
		b.fly();
		b.sing();
		System.out.println(a);
	}

}
