package com.encore.day05;

import java.util.Date;

public class Employee {
	static String company = "엔코아시스템"; //현재 클래스가 메모리에 올라올 때 바이트코드로 올라간다. 
	static int count;
	String empId;//new할 때 메모리에 올라온다.
	String empName;
	String dept;
	int salary;
	Date hireDate;

	// default 생성자(반드시 클래스 이름이랑 같아야한다.) // this 현재 만들고 있는 객체의 값
	// 생성자가 추가되면 default 생성자가 지원진다. default 생성자는 기본제공, argument가 없다.
	// 생성자의 Overloading이 제공된다. 이름같고 매개변수가 다른 여러 생성자가 정의가 가능하다.
	Employee() {
		this(null, null, null, 100, new Date());// 이것이 default생성자
	}

	Employee(String empId, String empName, String dept) {
		// 하나의 생성자가 다른 모양의 생성자를 호출하고 싶다. 코드가 중복되기 때문에
		this(empId, empName, dept, 100, new Date());
	}

	Employee(String empId, String empName) {
		this(empId, empName, null, 100, new Date());
	}

	public Employee(String empId, String empName, String dept, int salary, Date hireDate) {
		
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public void empInfo() {
		System.out.println("========직원이 등록되었습니다==========");
		count++;
		System.out.println("화사명: "+company);
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(dept);
		System.out.println(salary);
		System.out.println(hireDate);
		System.out.println("*************");
	}
}