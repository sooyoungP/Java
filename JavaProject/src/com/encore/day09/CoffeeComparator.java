package com.encore.day09;

import java.util.Comparator;

public class CoffeeComparator implements Comparator<Coffee> {
	@Override
	public int compare(Coffee o1, Coffee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);// �տ��� ũ�� ���, �ڿ��� ũ�� ����, ������ 0

	}

}
