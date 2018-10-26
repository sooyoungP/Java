package com.encore.day05;

public class Teacher {
	private String name;
	private int age;
	private String subject;
	
	public Teacher(String name, int age, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print() {
		System.out.print("이      름 : "+name+"\t");
		System.out.print("나      이 : "+age+"\t");
		System.out.println("담당과목 : "+subject);
		
	}
}
