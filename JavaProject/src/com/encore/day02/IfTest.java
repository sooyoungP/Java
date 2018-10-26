package com.encore.day02;

public class IfTest {
	public static void call( ) {
		//점수:90이상 = A학점, 80이상 = B학점, 70이상 = C학점, 60이상이면 = D학점, 나머지는 F학점
		int total = 98;
		String grade;
		
		if (total >= 90) {
			if (total >=95) {
				grade = "A+";
			}else {
				grade="A-";
			}
			//grade = "A";
		}else if (total >= 80) {
			grade = "B";
		}else if (total >= 70) {
			grade = "C";
		}else if (total >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println("당신의 학점은 " + grade +" 입니다");
		
		
		
	}
	
	public static void call2() {
		int total = 100; 
		String grade;
		System.out.println(total/10);
		switch(total/10) { // 정수나누기 정수는 정수이다. 
		case 10://switch역이용 경우
		case 9:
			if(total>=95) {
				grade = "A+";						
			}else {
				grade = "A-";
			} break;
			//grade="A";break;
		case 8:
			grade="B";break;//break를 걸어줘야 중간에 멈춘다
		case 7:
			grade="C";break;
		case 6
		:grade="D";break;
		default :grade="F";
		}
		System.out.println(grade);
	}
	
	public static void main(String[] args) {
		call2();
		
		
		
	}
}
