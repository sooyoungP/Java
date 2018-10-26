package com.encore.day05;

public class MainTest {

	public static void main(String[] args) {
		Student student = new Student("홍길동",20,200201);
		Teacher teacher = new Teacher("이순신", 30,"JAVA");
		Employeee employee = new Employeee("유관순",40,"교무과");
		
		student.print();
		teacher.print();
		employee.print();
		
		

	}

}
