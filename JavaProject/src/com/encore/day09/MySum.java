package com.encore.day09;

public class MySum {
	int first;
	int second;

	MySum(int first, int second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		int result = first + second;
		return String.valueOf(result);
		//�����ϰ� ǥ���Ϸ��� return first + second +"";
		//int�� String���� ǥ���Ҷ� ������ ����� ������ ���ϴ°�!
	}

	@Override
	public boolean equals(Object obj) {
		MySum ms = (MySum) obj;
		if (toString().equals(ms.toString())) {
			return true;
		} else {
			return false;
		}
	}

}
