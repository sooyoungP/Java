package com.encore.day09;

import java.util.Comparator;

public class DescendingSort implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1); // �⺻�� ascending �ݴ�� �Ϸ��� o1�� o2�� �ٲ��ش�
	}

}
