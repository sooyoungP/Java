package com.encore.day05;

public class Employeee {
	private String name;
	private int age;
	private String dept;
	
	public Employeee(String name, int age, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		System.out.print("이      름 : "+name+"\t");
		System.out.print("나      이 : "+age+"\t");
		System.out.println("부      서 : "+dept);
		
	}
	
	
	
}
