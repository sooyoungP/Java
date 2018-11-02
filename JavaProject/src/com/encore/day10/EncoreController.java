package com.encore.day10;

import java.util.ArrayList;
import java.util.List;

public class EncoreController {

	public static void insert(List<String> data) {
		data.add("������");
		data.add("ȭ����");
		data.add("������");
		data.add("�����");
		data.add("�ݿ���");
		data.add("ȭ����");
		data.add("�����");
	}

	public static void process(List<String> data) {
		EncoreDAO dao = new EncoreDAO();
		dao.updates(data);
			
		}

	public static void main(String[] args) {
		List<String> data = new ArrayList<>();
		// ������ �Է�
		insert(data);
		// ������ ���
		process(data);
		// ������ ó��
		EncoreView.htmlPrint(data);
	}
}
