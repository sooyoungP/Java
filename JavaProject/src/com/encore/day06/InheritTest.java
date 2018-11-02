package com.encore.day06;

class Parent{ //extends Object가 숨겨져있지만 존재한다.
	//자식이 부모를 부를 때는 super로 부른다.
	
	String name;
	
	Parent(){
	}
	Parent(String a){
		super();
		name = a;
		System.out.println("parent의 생성자");
	}
	
	public void print() {
		System.out.println("parent에서 출력한name: "+name);
	}
}

class Child extends Parent{
	String name2;
	
	Child(String a, String b){
		super();
		this.name = a;
		this.name2 = b;
		System.out.println("Child의 생성자");
	}
	
	public void print2() {
		System.out.println("name: "+name);
		System.out.println("name2: "+name2);
	}
}

public class InheritTest {

	public static void main(String[] args) {
		Child c = new Child("김","박");
		
		c.print();
		c.print2();
		
		System.out.println(c.name);
		System.out.println(c.name2);

	}

}
