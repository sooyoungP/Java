package com.encore.day10;

public class BoxTest {

	public static void call() {
		Box<Integer> b1 = new Box<Integer>(10, "����", "green"); // �⺻���� �ȵȴ�
		System.out.println(b1);
		Box<String> b2 = new Box<String>("�߰�������", "����", "red");
		System.out.println(b2);
		// ���׸������� �ƹ�Ÿ���̳� �� �� �� �ִ�. ��ü�� �� �� �ִ�. �� �ʱ�ȭ ��Ű�鼭 �־���Ѵ�.
		// Box<MySum> b3 = new Box<MySum>(new MySum(10,20),"õ","white");
	}

	public static void main(String[] args) {
		call();

	}

}
