package com.encore.day02;

public class 구구단 {

	public static void sub() {
		
		for (int b=1; b<=9; b++) {
			for(int a=2; a<=9; a++) {
				//System.out.print(a+"X"+ b + "=" + a*b +"\t"); 
				System.out.printf("%dx%d=%d\t",a,b,a*b);
			}
			System.out.println();
		}
	}
	
	public static void sub2() {
		//int a = 2;
		int b = 1;
		do {
			int a = 2;
			do {
				System.out.print(a + "x" + b + "=" + a * b + "\t");
				a++;
			} while (a <= 9);
			System.out.println();
			b++;
		} while (b < 9);
	}

	public static void main(String[] args) {
		
		sub2();
		// 2~9단 출력
		// 2*1 2*2.......2*9
		
		
		/*aa : for(int dan=2; dan<=9; dan++) {
			
			if(dan ==3) continue;
			
			System.out.println("******"+dan+"단******");
			for(int gop=1; gop<=9; gop++) {
				//if(gop == 4) break aa; //break는 가장 가까운 함수만 빠진다.
				System.out.println(dan + "*" + gop + "=" + dan*gop);
			}
			//System.out.println("=========================");	
	}*/
}
}
