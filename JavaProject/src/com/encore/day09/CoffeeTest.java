package com.encore.day09;

import java.util.Objects;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee c1 = new Coffee("아메리카노", 3000, 'S');
		Coffee c2 = new Coffee("카페라떼", 4000, 'L');

		int ret = c1.compareTo(c2);
		System.out.println(ret);

		if (ret > 0)
			System.out.println("c1이 크다");
		else if (ret < 0)
			System.out.println("c2가 크다");
		else
			System.out.println("같다");
		
		ret = Objects.compare(c1, c2, new CoffeeComparator());
		if (ret > 0)
			System.out.println("c1이 크다");
		else if (ret < 0)
			System.out.println("c2가 크다");
		else
			System.out.println("같다");

	}

}
