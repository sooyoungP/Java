package com.encore.day10;

import java.util.ArrayList;
import java.util.List;

//DAO (Date Access Object), DB�� ���õ� ������ ��� ���°�. DB�� ���� �����ϸ� ���߿� ���� ������ �����
public class StudentDAO {

	boolean first = true;

	public List<Student> select(List<Student> data) {
		// DB����
		// BD��ȸ
		if (first) {

			data.add(new Student("�ڼҿ�", 100));
			data.add(new Student("�ڼҿ�2", 60));
			data.add(new Student("�ڼҿ�3", 80));
			data.add(new Student("�ڼҿ�4", 90));
			data.add(new Student("�ڼҿ�5", 50));
			first = false;
		}
		return data;
	}

	public void insert(Student std, List<Student> data) {
		data.add(std);
	}

}
