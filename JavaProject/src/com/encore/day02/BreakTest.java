package com.encore.day02;

public class BreakTest {
	public static void main(String[] args) {
		//break : switch �������� �� / �ݺ� ������ �������� �� ����Ѵ�.
		
		int count = 0;
		
		while (true) {
			System.out.println("�����");
			count++;
			if (count == 10) break; 
			System.out.println("========");
		}

	}
}
