package com.encore.day09;

public class ObjectTest2 {

	public static void call() {
		Car c = new Car("BMW720", 7000);
		Car c2 = c; // 복제가 아니라 복사. 둘다 같은 값이 나온다. 하나의 값을 변경하면 둘다 변경된다.

		System.out.println(c);
		System.out.println(c2);
		c2.setModel("그랜저");
		System.out.println(c);
		System.out.println(c2);
	}

	public static void call2() {
		Car c = new Car("BMW720", 7000);
		try {
			Car c2 = (Car) c.clone();

			System.out.println(c);
			System.out.println(c2);

			c2.setModel("그랜저");

			System.out.println(c);
			System.out.println(c2);

		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
	}

	public static void call3() throws CloneNotSupportedException {
		Car c = new Car("모델", 5000, new String[] { "하이패스카드", "네비게이션" });
		Car c2 = (Car) c.clone();
		System.out.println(c);
		System.out.println(c2);
		c.setModel("모델 변경");
		c.acc[0] = "악세서리 변경";
		System.out.println(c);
		System.out.println(c2); // 현재 얕은 복제 (배열은 바뀌지 않고 스트링값만 변겨)
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		call3(); // 메인은 오류를 자바가상 머신한테 보낸다
	}

}
