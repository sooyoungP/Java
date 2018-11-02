package com.encore.day10;

import java.util.List;

public class StudentView {

	public static void dispaly(List<Student> data) {
		System.out.println("========학생정보입니다=======");

		for (Student s : data) {
			System.out.println(s.toString());
		}
	}
}
