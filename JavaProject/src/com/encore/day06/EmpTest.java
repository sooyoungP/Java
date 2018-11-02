package com.encore.day06;

public class EmpTest {

	public static void main(String[] args) {
		Employee emp = new Employee("100","박소영","데이터분석부");
		Manager m = new Manager("200","박소영2","개발부","pm");
		
		emp.print();
		m.print2();
		
		
	}

}
