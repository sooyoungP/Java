package com.encore.day02;

public class ForTest {
	public static void call() {
		// 1~18���� ����Ѵ�.
		for(int i=1; i<=10; i++) {			//���ǿ� �¾ƾ� for������ ����.  **for(;;) ���� ������� �ǹ��̴�.**
			System.out.println(i);
		}
	
	}
	
	public static void call2() {
		// 1~18���� ����Ѵ�.
		int i=1;
		while(true) {//�ѹ��� ������ �ȵ� �� �ִ�.
			if(i>10) break;
			System.out.println(i);
			i++;
		}

	}
	
	public static void call3() {
		// 1~18���� ����Ѵ�.
		int i=1;
		do {//��� �ѹ��� �����Ѵ�.
			if(i>10) break;
			
			System.out.println(i);
			i++;
		}while(true);
	
	}
	
	public static void call4() {
		// 1~18���� ����Ѵ�.
		int i=11;
		do {//��� �ѹ��� �����Ѵ�.
			System.out.println(i);
			i++;
		}while(i<10);
	
	}
	
	public static void main(String[] args) {
		call4();
		

	}

}
