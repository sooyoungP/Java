package com.encore.day01;

public class TypeCastTest {

	public static void main(String[] args) {
		// 1. �ڵ�����ȯ
		
		byte by = 100; //���� ū ����Ʈ�� 127
		int i = 200;
		
		// byte < short(2) < int(4),������ �� �⺻�� < long(8) < float(4) < double(8),�Ҽ��� �� �⺻��
		//		  char(2) >> char�� ������ ���⶧���� short�� ũ��� ���Ƶ� ��ȯ�� �ȵȴ�.
		i = by;
		System.out.println("byte�� int�� ����:"+i); //���� + ���� �� ����
		
		// 2. ��������ȯ ����, �׷��� ������ �ս� ���ɼ� ����
		by = (byte)i;
		System.out.println("in�� byte�� ����:" + by);
		// 2-1. ��������ȯ�� ���� ������ �ս��� �߻��� ����̴�.
		double d = 3.14; //�Ǽ� ������
		//d = 1;
		int i2 = (int)d;
		System.out.println(i2); //int�� �����ε� floatŸ���� �־ ������ �ս��� �߻��ߴ�. 
		System.out.println(d); //���� �����ʹ� �״�� �ִ�.
		
		//����
		//���� ���� ū������ ���� �ڵ� ����ȯ
		
		int sy = 44031;
		char syp = 'A';
		
		//�ڵ�
		sy = syp;
		System.out.println("�ڵ���ȯ:"+sy);
		//����
		sy++;
		System.out.println("�����?:"+sy);
		syp = (char)sy;
		System.out.println("��������ȯ:"+syp);
		
		
		//�����ϱ�
		
		int sysy = 13;
		sysy++;
		System.out.println(sysy);
		System.out.println(sysy++);
		System.out.println(sysy);
		System.out.println(++sysy);
		
		sysy--;
		System.out.println(sysy);
		System.out.println(sysy--);
		System.out.println(sysy);
		System.out.println(--sysy);
		
		//���δٸ� ������ ���ϱ�
		
		int a = 100;
		double b = 3.14;
		
		//double result = a+b;
		//System.out.println(result); // int�� �ڵ����� double�� ��ȯ�Ѵ�. �ᱹ ����Ÿ���� ūŸ������ �ڵ� ����ȯ
		
		int result = (int)(a+b);
		System.out.println(result); // ��������ȯ�� ����� ūŸ���� ����Ÿ������ �̵��Ѵ�.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

	}

}
