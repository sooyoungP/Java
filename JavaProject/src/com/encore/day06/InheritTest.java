package com.encore.day06;

class Parent{ //extends Object�� ������������ �����Ѵ�.
	//�ڽ��� �θ� �θ� ���� super�� �θ���.
	
	String name;
	
	Parent(){
	}
	Parent(String a){
		super();
		name = a;
		System.out.println("parent�� ������");
	}
	
	public void print() {
		System.out.println("parent���� �����name: "+name);
	}
}

class Child extends Parent{
	String name2;
	
	Child(String a, String b){
		super();
		this.name = a;
		this.name2 = b;
		System.out.println("Child�� ������");
	}
	
	public void print2() {
		System.out.println("name: "+name);
		System.out.println("name2: "+name2);
	}
}

public class InheritTest {

	public static void main(String[] args) {
		Child c = new Child("��","��");
		
		c.print();
		c.print2();
		
		System.out.println(c.name);
		System.out.println(c.name2);

	}

}
