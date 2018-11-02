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
		Arrays.fill(arr, 100); // 값을 한꺼번에 넣을 때! Arrays.fill을 사용하면 된다.
		System.out.println(Arrays.toString(arr));
	}

	public static void call4() {
		int a = 10;
		Integer b = 20; // new Integer(20)와 같은 의미이다 >> 내부적으로 자동으로 박싱해준다.
		Integer c = new Integer(30);
		System.out.println(b);// b.intValue()와 같은 의미이다 >>자동으로 언박싱 해준다.
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
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH) + 1 + "월");
		cal.set(2005, 7, 31);
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH) + 1 + "월");
	}

	public static void main(String[] args) {

		call8();
	}

}
