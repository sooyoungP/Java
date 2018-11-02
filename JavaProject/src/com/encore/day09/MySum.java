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
		//간단하게 표현하려면 return first + second +"";
		//int를 String으로 표현할때 간단한 방법은 공백을 더하는것!
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
