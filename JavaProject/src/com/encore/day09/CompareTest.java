package com.encore.day09;

import java.util.Objects;

public class CompareTest {

	public static void call() {
		String s1 ="자바";
		String s2 ="데이터베이스";
		int result = s1.compareTo(s2); //<,=,> : 양수가 나오면 앞의 문자 더 크다, 음수이면 뒤의 문자가 더 크다, 둘이 같으면 0이나온다.
		//string변수가 Comparable를 상속받고있다.
		System.out.println(result);
	}
	
	public static void call2() {
		//기본형은 값을 저장하고 값을 비교하고 값을 연산하는 기능만 할 수 있다.
		int a =10;
		//참조형은 값을 저장하고 값을 비교하고 값을 연산하고 추가로 다른 기능들이 더 있다.
		Integer b = 20; 
		Integer c = 10;
		
		int result = b.compareTo(c);//>,<,= : 양수가 나오면 앞의 문자 더 크다, 음수이면 뒤의 문자가 더 크다, 둘이 같으면 0이나온다.
		System.out.println(result);
	}
	
	public static void call3() {
		Computer c1 = new Computer("A","B",1000,null);
		Computer c2 = new Computer("A","C",2000,null);
		int result = c1.compareTo(c2);
		//System.out.println(result>0?"c1이비싸":"c2가비싸");
		System.out.println(result>0?"c1이 크다":"c2가 크다");
		
		result = Objects.compare(c1, c2, new ComputerCompare());
		System.out.println(result>0?"c1이 비싸":result==0?"같다":"c2가 크다");
	}
	
	public static void main(String[] args) {
		call3();

		
	}

}
