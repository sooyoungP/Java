package com.encore.day02;

public class ForTest {
	public static void call() {
		// 1~18까지 출력한다.
		for(int i=1; i<=10; i++) {			//조건에 맞아야 for문으로 들어간다.  **for(;;) 무한 루프라는 의미이다.**
			System.out.println(i);
		}
	
	}
	
	public static void call2() {
		// 1~18까지 출력한다.
		int i=1;
		while(true) {//한번도 실행이 안될 수 있다.
			if(i>10) break;
			System.out.println(i);
			i++;
		}

	}
	
	public static void call3() {
		// 1~18까지 출력한다.
		int i=1;
		do {//적어도 한번은 수행한다.
			if(i>10) break;
			
			System.out.println(i);
			i++;
		}while(true);
	
	}
	
	public static void call4() {
		// 1~18까지 출력한다.
		int i=11;
		do {//적어도 한번은 수행한다.
			System.out.println(i);
			i++;
		}while(i<10);
	
	}
	
	public static void main(String[] args) {
		call4();
		

	}

}
