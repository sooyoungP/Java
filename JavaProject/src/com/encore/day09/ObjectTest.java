package com.encore.day09;

public class ObjectTest {

	public static void call1() {

		Object obj1 = new Object();
		Object obj2 = new Object();

		System.out.println(obj1);
		System.out.println(obj1.toString());

		System.out.println(obj2);
		System.out.println(obj2.toString());

		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
	}

	public static void call2() {

		String obj1 = new String("고구마");
		String obj2 = new String("고구마");

		System.out.println(obj1);
		System.out.println(obj1.toString());

		System.out.println(obj2);
		System.out.println(obj2.toString());

		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
	}

	public static void call3() {

		Car obj1 = new Car("그랜져", 5000);
		Car obj2 = new Car("그랜져", 5000);
		String obj3 = new String("그랜져TG");

		System.out.println(obj1);
		System.out.println(obj1.toString());

		System.out.println(obj2);
		System.out.println(obj2.toString());

		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3)); // 런타임이셉션. 일단 String은 오브젝트에 속하기때문에 오류가 안난다.

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
	
	public static void callPerson() {

		Person obj1 = new Person("신상림","F",20);
		Person obj2 = new Person("신상림","F",20);

		System.out.println(obj1);
		System.out.println(obj1.toString());

		System.out.println(obj2); //문자열 얻기
		System.out.println(obj2.toString()); //문자열 얻기

		System.out.println(obj1 == obj2); //주소비교
		System.out.println(obj1.equals(obj2)); //내용비교
		

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

	public static void main(String[] args) {
		callPerson();

	}

}
