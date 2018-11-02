package com.encore.day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionTest {

	public static void call1() {
		Vector data = new Vector();// vector�� java.util�ȿ� �ִ�. 10�� ¥�� ������ array�� ������ش�(�߰����� ���� �˾Ƽ� 10���� ����) = Vector
		data.add(100);
		data.add("�ڹ�");
		// ������ object�� ����.
		int a = (Integer) data.get(0);
		String b = (String) data.get(1);

		System.out.println(a);
		System.out.println(b);
	}

	public static void call2() {
		// Vector : list �������̽��� ����(������ �ִ�, �ߺ��� ����Ѵ�.),����� �� ������ �ʴ´�
		Vector<String> data = new Vector<>(); // ���׽ý��� ����ϸ� �ݺ��Ǵ� �ڵ带 ���� �� �ִ�.
		data.add("�ڹ�1");
		data.add("�ڹ�1");
		data.add("�ڹ�3");
		data.add("�ڹ�4");
		data.add("�ڹ�5");

		String s = data.get(1);

		System.out.println(s);

		System.out.println(data.size());
	}

	public static void call3() {
		// ArrayList: list �������̽��� ����
		ArrayList<String> data = new ArrayList<>();
		data.add("������");
		data.add("ȭ����");
		data.add("������");
		data.add("�����");
		data.add("�ݿ���");
		data.add("ȭ����");
		data.add("�����");

		// 1. �Ϲ����� for ����
		System.out.println("======�Ϲ�for======");
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
		// 2. �⼧�� for ����
		System.out.println("======�⼧��for======");
		for (String s : data) {
			System.out.println(s);
		}
		// 3. Iterator(����Ʈ�� Iterator�� ���·� �ٲ��)
		System.out.println("======Iterator======");
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {// ��ū�� �ִ� = ���������Ͱ� �ִ�? ���������� ����
			System.out.println(it.next());
		}
	}

	public static void call4() {
		// LinkedList: list �������̽��� ����
		LinkedList<String> data = new LinkedList<>();
		data.add("������");
		data.add("ȭ����");
		data.add("������");
		data.add("�����");
		data.add("�ݿ���");
		data.add("ȭ����");
		data.add("�����");

		// 1. �Ϲ����� for ����
		System.out.println("======�Ϲ�for======");
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
		// 2. �⼧�� for ����
		System.out.println("======�⼧��for======");
		for (String s : data) {
			System.out.println(s);
		}
		// 3. Iterator(����Ʈ�� Iterator�� ���·� �ٲ��)
		System.out.println("======Iterator======");
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {// ��ū�� �ִ� = ���������Ͱ� �ִ�? ���������� ����
			System.out.println(it.next());
		}
	}

	public static void getData(List<String> data) {// �����͸� ���� ���� ã�´�
		data.add("������");
		data.add("ȭ����");
		data.add("������");
		data.add("�����");
		data.add("�ݿ���");
		data.add("ȭ����");
		data.add("�����");
	}

	public static void print(List<String> data) { // �����Ͱ� ������ �����͸� ��⸸�Ѵ�.

		// 1. �Ϲ����� for ����
		System.out.println("======�Ϲ�for======");
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
		// 2. �⼧�� for ����
		System.out.println("======�⼧��for======");
		for (String s : data) {
			System.out.println(s);
		}
		// 3. Iterator(����Ʈ�� Iterator�� ���·� �ٲ��)
		System.out.println("======Iterator======");
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {// ��ū�� �ִ� = ���������Ͱ� �ִ�? ���������� ����
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) { // ������ ª�� ����Ѵ�. �����ľ��� �ϱ�����
		// �����͸� ���;��Ѵ�.
		List<String> mylist = new ArrayList<>(); // ����� �ϳ� ��������� ���� �� ���� ���Ѵ�.
		getData(mylist); // �����͸� ��� ����
		print(mylist); // �����͸� ����ϴ� ����
	}

}
