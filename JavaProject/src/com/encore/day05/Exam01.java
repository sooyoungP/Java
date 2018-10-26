package com.encore.day05;

public class Exam01 {

	public static void main(String[] args) {
		Staff[] staff = new Staff[4];
		staff[0] = new Staff("이부장", "부장", 1500000);
		staff[1] = new Staff("김과장", "과장", 1300000);
		staff[2] = new Staff("최대리", "대리", 1200000);
		staff[3] = new Staff("박사원", "사원", 1000000);

		for (Staff i : staff) {
			i.getTotalSalary();
			i.print();
			System.out.println("이름: "+ i.getName());
			System.out.println("직책: "+ i.getTitle());
			System.out.println("기본급: "+ i.baseSalary);
			System.out.println("수령액: "+ i.totalSalary);
		}

		for (int i = 0; i < 4; i++) {
			staff[i].getTotalSalary();
			staff[i].print();
		}

	}
}
