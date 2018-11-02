package com.encore.day09;

import java.util.Objects;

public class CompareTest {

	public static void call() {
		String s1 ="�ڹ�";
		String s2 ="�����ͺ��̽�";
		int result = s1.compareTo(s2); //<,=,> : ����� ������ ���� ���� �� ũ��, �����̸� ���� ���ڰ� �� ũ��, ���� ������ 0�̳��´�.
		//string������ Comparable�� ��ӹް��ִ�.
		System.out.println(result);
	}
	
	public static void call2() {
		//�⺻���� ���� �����ϰ� ���� ���ϰ� ���� �����ϴ� ��ɸ� �� �� �ִ�.
		int a =10;
		//�������� ���� �����ϰ� ���� ���ϰ� ���� �����ϰ� �߰��� �ٸ� ��ɵ��� �� �ִ�.
		Integer b = 20; 
		Integer c = 10;
		
		int result = b.compareTo(c);//>,<,= : ����� ������ ���� ���� �� ũ��, �����̸� ���� ���ڰ� �� ũ��, ���� ������ 0�̳��´�.
		System.out.println(result);
	}
	
	public static void call3() {
		Computer c1 = new Computer("A","B",1000,null);
		Computer c2 = new Computer("A","C",2000,null);
		int result = c1.compareTo(c2);
		//System.out.println(result>0?"c1�̺��":"c2�����");
		System.out.println(result>0?"c1�� ũ��":"c2�� ũ��");
		
		result = Objects.compare(c1, c2, new ComputerCompare());
		System.out.println(result>0?"c1�� ���":result==0?"����":"c2�� ũ��");
	}
	
	public static void main(String[] args) {
		call3();

		
	}

}
