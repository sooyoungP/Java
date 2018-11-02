package com.encore.day10;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTest {

	public static void call2() {
		String friends = "박세환&정윤도-정인창,이광호,허정표";
		StringTokenizer st = new StringTokenizer(friends, "&,-");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.println(s);
		}
		System.out.println(st.countTokens());
	}

	public static void call() {
		String friends = "박세환&정윤도-정인창,이광호,허정표";
		String[] names = friends.split("&|-|,");
		for (String s : names) {
			System.out.println(s);
		}
		System.out.println(Arrays.toString(names));
	}

	public static void main(String[] args) {
		call2();
	}

}
