package com.encore.day05;

import java.util.Date;

public class EmpTest {

	public static void main(String[] args) {
		Employee[] emp = new Employee[5];

		emp[0] = new Employee("600", "�ڼҿ�4", "�����ͺм���", 500, new Date());
		emp[1] = new Employee("400", "�ڼҿ�3", "���ߺ�");
		emp[2] = new Employee("200", "�ڼҿ�2");
		emp[3] = new Employee();
		emp[4] = new Employee("700", "�ڼҿ�5", "�м���", 1550, new Date());

		/*for (int i = 0; i < 5; i++) {
			emp[i].empInfo();
		}*/
		for(Employee aa:emp) {
			aa.empInfo();
		}

	}

}
