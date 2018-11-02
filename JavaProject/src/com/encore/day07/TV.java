package com.encore.day07;

public interface TV {

	//1.상수
	int KBS = 7; // public static final 생략가능
	int SBS=6; // public static final 생략가능 
	public static final int MBC=11;
	public static final int KBS2=9;
	
	
	//2.추상메서드
	public abstract void powerOn();
	void powerOff(); // public abstract 생략 가능
	
	//3.default (java8버전에서 새로 나옴)
	
	
	//4.static (java8버전에서 새로 나옴)
}
