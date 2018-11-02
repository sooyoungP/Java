package com.encore.day10;

import java.util.ArrayList;
import java.util.List;

//DAO (Date Access Object), DB에 관련된 업무를 모아 놓는곳. DB랑 직접 연결하면 나중에 유지 보수에 힘들다
public class StudentDAO {

	boolean first = true;

	public List<Student> select(List<Student> data) {
		// DB연결
		// BD조회
		if (first) {

			data.add(new Student("박소영", 100));
			data.add(new Student("박소영2", 60));
			data.add(new Student("박소영3", 80));
			data.add(new Student("박소영4", 90));
			data.add(new Student("박소영5", 50));
			first = false;
		}
		return data;
	}

	public void insert(Student std, List<Student> data) {
		data.add(std);
	}

}
