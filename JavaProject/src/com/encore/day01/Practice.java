package com.encore.day01;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		int salary;
		int deposit;
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ�:");
		salary = input.nextInt();
		
		deposit = 10 * 12 * salary;
		System.out.printf("10�� ������ �����:%d\n", deposit);
			
	}
	
	public static void TEST(String[] args) {
		int half;
		int area;
		Scanner input = new Scanner(System.in);
		
		System.out.println("�������� �Է��Ͻÿ�:");
		half = input.nextInt();
		
		area = 3.14 * half * half;
		System.out.printf("���� ������:%d\n", area);
			
	}

}
