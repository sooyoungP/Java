package com.encore.day09;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import javax.xml.stream.util.StreamReaderDelegate;

public class StringTest {

	
	public static void call() {
		String str = "�ڹ� ���α׷���";
		System.out.println(str.charAt(3));
		System.out.print(str.substring(1, 5)); //1<= ����Ʈ <5 (1�̻� 5�̸�)
		System.out.println();
		System.out.println("===============");
		
		for(int i = 0; i <str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	public static void call2() {
		String str = "�ڹ� ���α׷���";
		char[] arr = str.toCharArray();

		for(char c:arr) {
			System.out.println(c);
		}
		
		System.out.println(arr[0]);
	}
	
	public static void call3() throws UnsupportedEncodingException {
		String str = "�ڹ� ���α׷���";
		byte[] arr = str.getBytes("utf-8");
		
		System.out.println(Arrays.toString(arr));
		String s2 = new String(arr, "utf-8");
		System.out.println(s2);
	}
	
	public static void call5() {
		String str = "�ڹ����α׷���";
		System.out.println(str.replace('��', '��'));
		System.out.println(str);
		
		String str2 = "   java programing     ";
		System.out.println(str2.toUpperCase());
		System.out.println(str2);
		System.out.println(str2.trim()); //�߰��� �ִ� ������ �߶����� �ʰ� �յ� ������ �߶��ش�.
		
	}
	
	public static void call6() {
		int a = 100;
		String s = String.valueOf(a);
		System.out.println(s + 200);
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		//���ڿ� ���
		call6();

	}

}
