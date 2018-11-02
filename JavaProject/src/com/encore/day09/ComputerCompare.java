package com.encore.day09;

import java.util.Comparator;

public class ComputerCompare implements Comparator<Computer>{
	//컴퓨터 2개가 들어오면 그 두개를 비교하기 위해서
	@Override
	public int compare(Computer o1, Computer o2) {
		return o1.price - o2.price;
	}
	
}
