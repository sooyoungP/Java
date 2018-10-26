package com.encore.day05;

public class Staff {
	String name;
	String title;
	int baseSalary;
	int totalSalary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void setTotalSalary(int totalSalary) {
		this.totalSalary = totalSalary;
	}

	public Staff(String name, String title, int baseSalary) {
		this.name = name;
		this.title = title;
		this.baseSalary = baseSalary;
	}

	public void getTotalSalary() {
		if (title.equals("부장")) {
			totalSalary = (int)(baseSalary + baseSalary*0.25);
		}else if (title.equals("과장")) {
			totalSalary = (int)(baseSalary + baseSalary*0.15);
		}else {
			totalSalary = (int)(baseSalary + baseSalary*0.05);
		}
	}

	public void print() {
		System.out.println(title
				+ "직급의 "
				+ name
				+ "씨의 본봉은 "
				+ baseSalary
				+ "원이고 총급여는 "
				+ totalSalary
				+ "원입니다.");
	}

}
