package com.encore.day09;

import java.util.Arrays;

public class SortTest {

	public static void call() {
		int[] arr = { 11, 4, 17, 23, 99, 144 };

		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void call2() {
		String[] arr = { "�ڹ�", "���̽�", "�ڹٽ�ũ��Ʈ", "�ϵ�", "���̺�", "���ø�" };

		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); // �⺻���� ��������
		System.out.println(Arrays.toString(arr));

		// �ݴ�� �������� �ϰ� ���� �� ���� DecscendingSort�� �����. �⺻�� ���������� �����Ǿ��ֱ⶧���� ������ �ʿ�
		Arrays.sort(arr, DescendingSort());
		System.out.println(Arrays.toString(arr));
	}

	public static void call3() {
		Coffee[] arr = { new Coffee("�Ƹ޸�ī��1", 1000, 'S'), new Coffee("�Ƹ޸�ī��5", 5000, 'S'),
				new Coffee("�Ƹ޸�ī��2", 2000, 'S'), new Coffee("�Ƹ޸�ī��4", 4000, 'S'), new Coffee("�Ƹ޸�ī��3", 3000, 'S') };

		System.out.println("before:" + Arrays.toString(arr));
		Arrays.sort(arr); // �⺻���� ��������
		System.out.println("before:" + Arrays.toString(arr));

		Arrays.sort(arr, new CoffeeComparator()); // ������ ���Ӱ� ���� �� ���� �ҷ��ͼ� ���Ӱ� �����Ѵ�.
		System.out.println("�̸���:" + Arrays.toString(arr));

	}

	public static void main(String[] args) {
		call3();
	}
}
