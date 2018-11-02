package com.encore.day09;

public class CellPhone {
	// 변수
	String model;
	double battery;

	CellPhone(String model) { // 모델번호를 인자를 받는 생성자
		this.model = model;
	}

	void call(int time) {
		if (time < 0)
			throw new IllegalArgumentException("통화시간입력오류"); // 런타입이셉션에 속한다.
		System.out.println("통화 시간: " + time);
		battery -= time * 0.5;
		if (battery < 0)
			battery = 0;
	}

	void charge(int time) {
		if (time < 0)
			throw new IllegalArgumentException("충전시간입력오류");
		System.out.println("충전시간: " + time + "분");
		System.out.println("남은 배터리 양: " + battery);
		battery += time * 3;
		if (battery > 100)
			battery = 100;
	}

	void printBattery() {
		System.out.println("남은 배터리 양: " + battery);
	}

	public boolean equals(Object otherObject) { // 접근제한자는 오버라이드받는 객체보다 같거나 커야한다.
		if (!(otherObject instanceof CellPhone))
			return false;
		CellPhone cc = (CellPhone) otherObject;
		return model.equals(cc.model);

		// return model.equals(((CellPhone) otherObject).model);

	}

}
