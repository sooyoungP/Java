package com.encore.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("�۾��� �������ּ���");
		System.out.println("1.��� ��ȸ, 2.�Է�, 9.������");

		List<Student> data = new ArrayList<>();

		StudentDAO dao = new StudentDAO();

		while (true) {
			System.out.println("�۾��� �������ּ���>>");
			int su = sc.nextInt();
			if (su == 9)
				break;
			if (su == 1) {
				data = dao.select(data);
				StudentView.dispaly(data);
			} else if (su == 2) {
				System.out.println("�̸��� ������ �Է� ���ּ���.");
				Student std = new Student(sc.next(), sc.nextInt());
				dao.insert(std, data);
			}
		}

	}

}
