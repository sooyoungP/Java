package com.encore.day09;

import java.util.Comparator;

public class DescendingSort implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1); // 기본은 ascending 반대로 하려면 o1과 o2를 바꿔준다
	}

}
