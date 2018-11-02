package com.encore.day07;

public class Duck {
	String name;
	int legs;
	double length;
	
	public Duck(String name, int legs, double length) {
		super();
		this.name = name;
		this.legs = legs;
		this.length = length;
	}
	
	void fly() {
		System.out.println(this.getClass().getSimpleName()+
				"("+name+")"
				+"는 날지 않습니다");
	}
	void sing() {
		System.out.println(this.getClass().getSimpleName()+
				"("+name+")"
				+"는 소리내어 웁니다");
	}
	void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "오리의 이름은 " + name +"입니다";
	}
	
}
