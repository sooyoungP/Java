package com.encore.day08;

public class ExceptionTest2 {

	
	public static void call(int age) throws MyException  {
		
		//throw �߻��ϴ�
		//throws ������
		if(age <= 10) throw new MyException("�ʹ������");
		
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
