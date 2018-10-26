package com.encore.day05;

public class Person {
	static int numbrOfPersons; // 공유변수
	int age;
	String name;

	Person() {
		this(12, "Anonymous");
	}

	Person(int age, String name) {
		this.age = age;
		this.name = name;
		numbrOfPersons++;
	}

	void selfIntroduce() {
		System.out.println("내이름은 " + name + "이며, 나이는 " + age + "살 입니다.");
	}

	int getPopulation() {
		return numbrOfPersons;
	}
}
