package com.encore.day07;

public class TvFactory {
//팩토리 패턴...tv를 만드는 공장
//NEW를 한곳에서 만들어야 한다.
	
	//이런 브랜드의 티비를 만들어주세요.
	//리턴값은 티비들의 상위 값
	public static TV makeTV(String brand) {
		TV tv = null;
		if(brand.equals("S")) {
			tv = new SamsungTV();
		}else if(brand.equals("L")) {
			tv = new LGTV();
		}else {
			
		}
		return tv;
	}
}
