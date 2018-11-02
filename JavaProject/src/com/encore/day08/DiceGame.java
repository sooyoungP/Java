package com.encore.day08;

class Dice {
	// 변수
	int size;

	// 초기화
	Dice(int size) {
		this.size = size;
	}

	// 메서드
	int play() { // 무작위로 숫자가 나온다.
		int number = (int) (Math.random() * size) + 1;
		return number;
	}
}

public class DiceGame {
	public static void main(String args[]) {

		DiceGame game = new DiceGame();

		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);

	}

	int countSameEye(int n) {

		int count = 0;
		// 예외처리
		try {
			if (n < 0) {
				throw new IllegalArgumentException("음수불가"); // 예외강제발생
			}
			Dice d1 = new Dice(8);
			Dice d2 = new Dice(8);
			for (int i = 1; i <= n; i++) {
				int su1 = d1.play();
				int su2 = d2.play();
				if (su1 == su2) {
					count++;
				}
				System.out.println(su1 + "-------" + su2);
			}

		} catch (IllegalArgumentException aa) { // 예외를 던지지 말고 내가 직접 캐치
			System.out.println(aa.getMessage());
		}
		return count;
	}
}