package com.encore.day10;

import java.util.List;

public class StudentView {

	public static void dispaly(List<Student> data) {
		System.out.println("========�л������Դϴ�=======");

		for (Student s : data) {
			System.out.println(s.toString());
		}
	}
}
