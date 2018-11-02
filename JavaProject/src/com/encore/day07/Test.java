package com.encore.day07;

//Object class안에 toString()이라는 함수가있다....주소를 출력하는 함수....>패키지이름.클래스이름( @hashcode의 hexa값 )
//String도 Object를 상속받았다. 하지만 String은 Object클래스의 toString를 재정의했다...그래서 내용만 출력
//자바는 객체를 찍으면 무조건 뒤에  toString()를 자동으로 붙인다
class Car {
	String model = "그랜저";

	//toString() 재정의를 하기위해
	@Override
	public String toString() {
		return "력셔리  자동차" + model;
	}
	
	
}
public class Test {

	public static void main(String[] args) {
		String s = new String("자바");
		System.out.println(s.toString());
		System.out.println(s);
		
		Car c = new Car();
		System.out.println(c);
		System.out.println(c.model);
		
		BonusPointAccount acc = new BonusPointAccount("111","박소영",1000,200);
		System.out.println(acc);
		

	}

}
