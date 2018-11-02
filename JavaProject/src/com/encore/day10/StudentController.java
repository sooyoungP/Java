package com.encore.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("작업을 선택해주세요");
		System.out.println("1.모두 조회, 2.입력, 9.끝내기");

		List<Student> data = new ArrayList<>();

		StudentDAO dao = new StudentDAO();

		while (true) {
			System.out.println("작업을 선택해주세요>>");
			int su = sc.nextInt();
			if (su == 9)
				break;
			if (su == 1) {
				data = dao.select(data);
				StudentView.dispaly(data);
			} else if (su == 2) {
				System.out.println("이름과 점수를 입력 해주세요.");
				Student std = new Student(sc.next(), sc.nextInt());
				dao.insert(std, data);
			}
		}

	}

}
