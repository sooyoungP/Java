package com.encore.day01;

public class VariableTest {
	
	
	// test �޼��� ����; �׽�Ʈ�� ���� �ҷ��� ȣ��ȴ�.
	public static void test( ) {
		int score = 300;
		System.out.println(score+500);
	}
	
	// main �޼��� ����; ������ �ڹ� ����ӽ��� �˾Ƽ� �ҷ��´�.
	public static void main(String[] args) {
		System.out.println("������ ����!");
		
		test(); //ȣ��...���ٰ� �ݵ�� ���ƿ´�.
		test(); //������ �θ� �� �ִ�.
		
		//1. �����Ҵ�
		int score;
		//2. ������ ���� �Ҵ�
		score = 100;
		//3. �������
		System.out.println(score);
		
		//����� �Ҵ��� ����
		int score2 = 200;
		int total = score + score2;
			
		System.out.println(score2);
		
		System.out.println(total);
		
		//���ͷ�
		byte b = 127; //1byte
		short s = 32767; //2byte
		int i = 2147483647; //4byte
		long lo = 2147483648L; //8byte
		float f = 3.14f; //4byte
		double d = 3.14; //8byte
		boolean bb = 1 > 2; //false
		char c ='��'; //�ѱ��ڸ� ����
		String str = "�ڹ�";
		System.out.println(bb);
		System.out.println(str);
		
		System.out.println("������ ��!");
		

	}

}
