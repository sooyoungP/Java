package com.encore.day05;

public class Person {
	static int numbrOfPersons; // ��������
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
		System.out.println("���̸��� " + name + "�̸�, ���̴� " + age + "�� �Դϴ�.");
	}

	int getPopulation() {
		return numbrOfPersons;
	}
}
