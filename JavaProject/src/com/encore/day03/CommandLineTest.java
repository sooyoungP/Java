package com.encore.day03;

public class CommandLineTest {

	public static void main(String[] args) {
		System.out.println("=======명령형 매개변수==========");
		
		//for (int i=0; i<args.length; i++) {
			//System.out.println(args[i]);
			
			//두개의 숫자를 받아서 사칙연산을 수행한다.
			if(args.length !=2) {
				System.out.println("Bye");
				return; //함수 빠지기
			}
			int su1 = Integer.parseInt(args[0]);
			int su2 = Integer.parseInt(args[1]);
			System.out.println(su1 + su2);
			System.out.println(su1 + su2);
		}

	}


