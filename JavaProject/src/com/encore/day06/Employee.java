package com.encore.day06;

public class Employee {
	String empId;
	String empName;
	String dept;
	
	//생성자
	public Employee() {
		
	}
	public Employee(String empId, String empName, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}



	public void print() {
		System.out.println("========직원정보입니다.=========");
		System.out.println("사번: "+empId);
		System.out.println("이름: "+empName);
		System.out.println("부서: "+dept);
		
		
	}
}
