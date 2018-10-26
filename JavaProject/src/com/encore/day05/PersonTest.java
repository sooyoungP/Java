package com.encore.day05;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person(20, "»ç¶÷1");
		
		p1.selfIntroduce();
		p2.selfIntroduce();
		p3.selfIntroduce();
		
	
		System.out.println(Person.numbrOfPersons);

	}

}
