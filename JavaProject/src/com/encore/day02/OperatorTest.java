package com.encore.day02;

public class OperatorTest {


	// �޼��� ����
	public static void method() {
		System.out.println("�޼��� ����");
		int a = 10;
		a++; //1�����ÿ� �ַ� ���ȴ�.
		a = a + 1;
		a += 1; // Ư�� ���ڸ�ŭ ������ ��
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println("�޼��� ��");
	}

	public static void method2() { // �޼����̸��� �ߺ��Ǹ� �ȵȴ�.
		System.out.println("===========�޼���2 ����============");
		int score = 95;
		//90�̻��̸� A����, �׷��� ������ B������ �ְ� �ʹ�.
		String grade;
		grade = score > 90 ? "A����" : "B����";
		System.out.println(grade);
		System.out.println(score > 90 ? "A����" : "B����");
		
		if(score>90) {
			grade = "A����";
		}else {
			grade ="B����";
		}
		System.out.println(grade);
		System.out.println("=============�޼���2 ��===========");
	}

	// �޼��� ����...main�� JVM�� ȣ���Ѵ�.
	public static void main(String[] args) {

		// �޼��� ȣ��...���ٰ� ���ƿ´�.
		method();
		method2();

		System.out.println("������ ����");

		System.out.println(10 > 20);
		System.out.println(!(10 > 20));

		System.out.println("������ ��");

	}
}
