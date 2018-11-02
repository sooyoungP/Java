package com.encore.day08;

public class ExceptionTest2 {

	
	public static void call(int age) throws MyException  {
		
		//throw 발생하다
		//throws 던지다
		if(age <= 10) throw new MyException("너무어려요");
		
	}
	
	public static void main(String[] args) {
		
		try {
			call(10);
		} catch (MyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			e.print();
		}
		System.out.println("Main End");
	}

}
