package com.encore.day07;

public class Directory extends Entry {

	//생성자 초기화
	Directory(String name){
		super(name);
	}
	//메서드 재정의
	public void print() {
		System.out.println(getName());
	}
}
