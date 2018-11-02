package com.encore.day10;

import java.util.ArrayList;
import java.util.List;

public class EncoreController {

	public static void insert(List<String> data) {
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("목요일");
		data.add("금요일");
		data.add("화요일");
		data.add("목요일");
	}

	public static void process(List<String> data) {
		EncoreDAO dao = new EncoreDAO();
		dao.updates(data);
			
		}

	public static void main(String[] args) {
		List<String> data = new ArrayList<>();
		// 데이터 입력
		insert(data);
		// 데이터 출력
		process(data);
		// 데이터 처리
		EncoreView.htmlPrint(data);
	}
}
