package com.encore.day05;

import java.util.Date;

public class EmpTest {

	public static void main(String[] args) {
		Employee[] emp = new Employee[5];

		emp[0] = new Employee("600", "박소영4", "데이터분석부", 500, new Date());
		emp[1] = new Employee("400", "박소영3", "개발부");
		emp[2] = new Employee("200", "박소영2");
		emp[3] = new Employee();
		emp[4] = new Employee("700", "박소영5", "분석부", 1550, new Date());

		/*for (int i = 0; i < 5; i++) {
			emp[i].empInfo();
		}*/
		for(Employee aa:emp) {
			aa.empInfo();
		}

	}

}
