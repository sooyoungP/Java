package com.encore.day07;

public class TvFactory {
//���丮 ����...tv�� ����� ����
//NEW�� �Ѱ����� ������ �Ѵ�.
	
	//�̷� �귣���� Ƽ�� ������ּ���.
	//���ϰ��� Ƽ����� ���� ��
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
