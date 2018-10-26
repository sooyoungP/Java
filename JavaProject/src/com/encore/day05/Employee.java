package com.encore.day05;

import java.util.Date;

public class Employee {
	static String company = "���ھƽý���"; //���� Ŭ������ �޸𸮿� �ö�� �� ����Ʈ�ڵ�� �ö󰣴�. 
	static int count;
	String empId;//new�� �� �޸𸮿� �ö�´�.
	String empName;
	String dept;
	int salary;
	Date hireDate;

	// default ������(�ݵ�� Ŭ���� �̸��̶� ���ƾ��Ѵ�.) // this ���� ����� �ִ� ��ü�� ��
	// �����ڰ� �߰��Ǹ� default �����ڰ� ��������. default �����ڴ� �⺻����, argument�� ����.
	// �������� Overloading�� �����ȴ�. �̸����� �Ű������� �ٸ� ���� �����ڰ� ���ǰ� �����ϴ�.
	Employee() {
		this(null, null, null, 100, new Date());// �̰��� default������
	}

	Employee(String empId, String empName, String dept) {
		// �ϳ��� �����ڰ� �ٸ� ����� �����ڸ� ȣ���ϰ� �ʹ�. �ڵ尡 �ߺ��Ǳ� ������
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
		System.out.println("========������ ��ϵǾ����ϴ�==========");
		count++;
		System.out.println("ȭ���: "+company);
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(dept);
		System.out.println(salary);
		System.out.println(hireDate);
		System.out.println("*************");
	}
}