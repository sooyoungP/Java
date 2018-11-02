package com.encore.day07;

public class PlayBird {

	public static void main(String[] args) {
		Duck a = new Duck("²Ð²ÐÀÌ",2,10);
		Sparrow b = new Sparrow("Â±Â±ÀÌ",2,5);
		
		a.fly();
		a.sing();
		System.out.println(a);
		
		b.fly();
		b.sing();
		System.out.println(a);
	}

}
