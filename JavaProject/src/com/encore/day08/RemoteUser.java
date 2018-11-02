package com.encore.day08;

public class RemoteUser {

	public static void work(RemoteControll r) { // 자식은 부모가 될 수 있다. 하위가 상위에 들어갈 수 있다.
		r.turnOn();
		r.turnOff();
		r.setting();
	}

	public static void main(String[] args) {
		// 전원을 켠다
		work(new Television()); // 텔레비전을 new하면 리모트컨트롤로 들어간다. //객체를 생성한 부분을 괄호에 넣는다.
		work(new Refrigerator());
		RemoteControll.print();
	}

}
