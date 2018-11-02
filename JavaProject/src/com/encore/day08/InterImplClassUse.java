package com.encore.day08;

public class InterImplClassUse {

	public static void main(String[] args) {

		InterImplClass a = new InterImplClass();

		// Inter1 a = new InterImplClass; //하위가 상위에 들어갈 수 있다.
		// a.print1(); //a.을 하면 Inter 1의 시점으로만 보인다.

		// Inter2 a = new InterImplClass; //하위가 상위에 들어갈 수 있다.
		// a.print5(); //a.을 하면 Inter 2의 시점으로만 보인다.

		// Parent a = new InterImplClass();

		System.out.println(a instanceof InterImplClass);
		System.out.println(a instanceof Inter1);
		System.out.println(a instanceof Inter1);
		System.out.println(a instanceof Parent);
		// 모두 true이다

		a.print1();
		a.print2();
		a.print3();
		Inter1.print4(); // static 매소드이기 때문에 인터페이스.매소드로 호출해야한다
		a.print5();
		a.print6();
		a.print7();
		Inter2.print8(); // static 매소드이기 때문에 인터페이스.매소드로 호출해야한다

	}

}
