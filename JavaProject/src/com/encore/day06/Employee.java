package com.encore.day06;

public class Employee {
	String empId;
	String empName;
	String dept;
	
	//������
	public Employee() {
		
	}
	public Employee(String empId, String empName, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}



	public void print() {
		System.out.println("========���������Դϴ�.=========");
		System.out.println("���: "+empId);
		System.out.println("�̸�: "+empName);
		System.out.println("�μ�: "+dept);
		
		
	}
}
