package com.encore.day09;

import java.util.Comparator;

public class ComputerCompare implements Comparator<Computer>{
	//��ǻ�� 2���� ������ �� �ΰ��� ���ϱ� ���ؼ�
	@Override
	public int compare(Computer o1, Computer o2) {
		return o1.price - o2.price;
	}
	
}
