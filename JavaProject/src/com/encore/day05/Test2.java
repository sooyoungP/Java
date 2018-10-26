package com.encore.day05;

public class Test2 {
public static void main(String[] args) {
	Employee e1 = new Employee("100", "방서경");
	Employee e2 = new Employee("200", "배지수");
	
	
	
	e2.company = "안랩";
	System.out.println(Employee.company);
	System.out.println(e2.company);
	e1.empInfo();
	e2.empInfo();
	
	System.out.println("직원 수"+Employee.count);
}
}
