package com.encore.day02;

public class LAB2 {

	public static void main(String[] args) {
		// �Ҽ�ã��
		
		for(int num=2; num<=50; num++) {
			boolean prime=true;
			for (int i=2; i<num; i++) {
				if (num % i ==0) {
					prime=false;
					break;
				}
			}
			if(prime)System.out.println(num);
		}
	}
}
