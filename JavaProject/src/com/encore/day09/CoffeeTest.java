package com.encore.day09;

import java.util.Objects;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee c1 = new Coffee("�Ƹ޸�ī��", 3000, 'S');
		Coffee c2 = new Coffee("ī���", 4000, 'L');

		int ret = c1.compareTo(c2);
		System.out.println(ret);

		if (ret > 0)
			System.out.println("c1�� ũ��");
		else if (ret < 0)
			System.out.println("c2�� ũ��");
		else
			System.out.println("����");
		
		ret = Objects.compare(c1, c2, new CoffeeComparator());
		if (ret > 0)
			System.out.println("c1�� ũ��");
		else if (ret < 0)
			System.out.println("c2�� ũ��");
		else
			System.out.println("����");

	}

}
