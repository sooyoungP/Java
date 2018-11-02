package com.encore.day10;

//DTO (Data Transfer Object)
//VO (Value Object)
// >> �����͸� ��� ����
public class Student {

	// ����
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

	// ������
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
