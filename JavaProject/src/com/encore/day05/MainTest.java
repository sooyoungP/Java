package com.encore.day05;

public class MainTest {

	public static void main(String[] args) {
		Student student = new Student("ȫ�浿",20,200201);
		Teacher teacher = new Teacher("�̼���", 30,"JAVA");
		Employeee employee = new Employeee("������",40,"������");
		
		student.print();
		teacher.print();
		employee.print();
		
		

	}

}
