package com.encore.day09;

//JavaBeans 기술 규격서
//멤버변수는 접근 제한자를 private로 한다.
//default 생성자는 필수이다
//외부에서 사용하려면 getter,setter를 만들어야한다.
public class Person {
	// 멤버변수
	private String name;
	private String gender;
	private int age;

	// default 생성자
	public Person() {

	}

	// 생성자 매서드
	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	// getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// toString 재정의
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Person))
			return false;

		Person p = (Person) obj;

		return age == p.age && name.equals(p.name) && gender.equals(p.gender);
	}

}
