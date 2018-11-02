package com.encore.day10;

//DTO (Data Transfer Object)
//VO (Value Object)
// >> 데이터를 담는 개념
public class Student {

	// 변수
	String name;
	int score;

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// 생성자
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	// toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=").append(name).append(", score=").append(score).append("]");
		return builder.toString();
	}

}
