package com.encore.day02;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// � ���� 7�� ����ΰ���?
		
		int count = 0; //ī��Ʈ��� ����:: ������ �������ؼ� ���� ����
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {//true���� ������ �������� ����.
		System.out.print("���ڸ� �Է��ϼ���:");
		int su =sc.nextInt();
		if(su == -1) break;
		String message;
		if (su % 7 == 0) {
			count++;
			message = "7�� ����Դϴ�";
		} else {
			message = "7�� ����� �ƴմϴ�";
		}
		System.out.println(message);
		}
		System.out.println("���ݱ��� �Է��� 7�ǹ����" + count +"�� �Դϴ�.");
	}
	
}
