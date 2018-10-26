package com.encore.day01;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		int salary;
		int deposit;
		Scanner input = new Scanner(System.in);
		
		System.out.println("월급을 입력하시오:");
		salary = input.nextInt();
		
		deposit = 10 * 12 * salary;
		System.out.printf("10년 동안의 저축액:%d\n", deposit);
			
	}
	
	public static void TEST(String[] args) {
		int half;
		int area;
		Scanner input = new Scanner(System.in);
		
		System.out.println("반지름을 입력하시오:");
		half = input.nextInt();
		
		area = 3.14 * half * half;
		System.out.printf("원의 면적은:%d\n", area);
			
	}

}
