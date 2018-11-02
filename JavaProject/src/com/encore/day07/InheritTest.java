package com.encore.day07;

class Parent{//부모는 자기것만 보인다.
	int a =100;
	int c = 300;
	
	void show() {
		System.out.println("Parent의 show 메서드입니다.");
	}
}

class Child extends Parent{//자식은 부모와 자기자신이 모두보인다.
	int b=200;
	String c; // 원래있던 부모의 int c를 덮어쓴다.
	
	void show() {
		System.out.println("Child의 show 메서드입니다.");
	}
}

public class InheritTest {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p);
		System.out.println(p.a);
		p.show();
		p.show();
		
		Child ch = (Child)p;
		System.out.println(ch.b);
		System.out.println(ch.c);
		ch.show();
	}
}

// Parent p = new Child ( 변수는 타입_parent을 따르고, 함수는 instance_child를 따른다)
