package com.encore.day07;

public class TV_user {
	public static void main(String[] args) {

		TV tv = TvFactory.makeTV("S"); //= new SamsungTV();
		tv.powerOff();
		tv.powerOn();

		if (tv instanceof SamsungTV) {
			((SamsungTV) tv).good();
		}
		if (tv instanceof LGTV) {
			((LGTV) tv).great();
		}

	}

}
