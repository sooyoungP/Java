package com.encore.day02;

public class IfTest {
	public static void call( ) {
		//����:90�̻� = A����, 80�̻� = B����, 70�̻� = C����, 60�̻��̸� = D����, �������� F����
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
		
		System.out.println("����� ������ " + grade +" �Դϴ�");
		
		
		
	}
	
	public static void call2() {
		int total = 100; 
		String grade;
		System.out.println(total/10);
		switch(total/10) { // ���������� ������ �����̴�. 
		case 10://switch���̿� ���
		case 9:
			if(total>=95) {
				grade = "A+";						
			}else {
				grade = "A-";
			} break;
			//grade="A";break;
		case 8:
			grade="B";break;//break�� �ɾ���� �߰��� �����
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
