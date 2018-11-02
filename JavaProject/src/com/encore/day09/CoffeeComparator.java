package com.encore.day09;

import java.util.Comparator;

public class CoffeeComparator implements Comparator<Coffee> {
	@Override
	public int compare(Coffee o1, Coffee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);// 앞에가 크면 양수, 뒤에가 크면 음수, 같으면 0

	}

}
