package com.encore.day06;

public class Manager extends Employee {

	String job;
	

	public Manager(String empId, String empName, String dept, String job) {
		super(empId,empName,dept);
		this.job = job;
	}
	
	public void print2() {
		System.out.println("============�Ŵ��� ����==========");
		print();
		System.out.println(job);
	}

}
