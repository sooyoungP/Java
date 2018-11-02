package com.encore.day10;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.regex.Pattern;

import util.DateUtil;

public class RegExpTest {

	public static void call(String phoneNum) {
		String regex = "0[01]{2}-[0-9]{4}-[0-9]{4}";
		boolean result = Pattern.matches(regex, phoneNum);
		System.out.println(result ? "ok" : "fail");

	}

	public static void call2(String userId) {
		String regex = "[A-Z]\\w+";
		boolean result = Pattern.matches(regex, userId);
		System.out.println(result ? "ok" : "fail");

	}

	public static void call3() {
		int[] arr = new int[10];
		Arrays.fill(arr, 100); // ���� �Ѳ����� ���� ��! Arrays.fill�� ����ϸ� �ȴ�.
		System.out.println(Arrays.toString(arr));
	}

	public static void call4() {
		int a = 10;
		Integer b = 20; // new Integer(20)�� ���� �ǹ��̴� >> ���������� �ڵ����� �ڽ����ش�.
		Integer c = new Integer(30);
		System.out.println(b);// b.intValue()�� ���� �ǹ��̴� >>�ڵ����� ��ڽ� ���ش�.
		System.out.println(b.intValue());
		System.out.println(Integer.toBinaryString(b));
		String s = "100";
		System.out.println(Integer.parseInt(s) + 200);
	}

	public static void call5() {
		Random r = new Random();
		int su = r.nextInt(45) + 1;
		System.out.println(su);
	}

	public static void call6() {
		Date d = new Date();
		System.out.println(d);

	}

	public static void call7() {
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(DateUtil.dateToString(d1));
	}

	public static void call8() {
		Calendar cal = Calendar.getInstance();
		// System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR) + "��");
		System.out.println(cal.get(Calendar.MONTH) + 1 + "��");
		cal.set(2005, 7, 31);
		System.out.println(cal.get(Calendar.YEAR) + "��");
		System.out.println(cal.get(Calendar.MONTH) + 1 + "��");
	}

	public static void main(String[] args) {

		call8();
	}

}
