package com.encore.day01;

public class OperatorTest {
	
	public static void test() {
		int a =10;
		int b =20;
		
		boolean result = a == 10 && b ==20; 
		//&&�� ���� ����� False�̸� ���� ������ �������� �ʴ´�.
		//||�� ���� ����� true�̸� ���� ������ �������� �ʴ´�.
		System.out.println(result);
	}
	public static void main(String[] args) {
		
		test();
		System.out.println("================================");
		
		//1.���׿�����
		int i = 100;
		i++;
		i++;
		++i;
		System.out.println("i="+i);
		
		int i2 = 200;
		int result = i++ + i2++; //++i�� ���� 1 ���ϰ� ����
		System.out.println(result); // i++�� �����ϰ� ���� ���߿� ���ϱ� 1
		System.out.println(i);
		System.out.println(i2);
		
		System.out.println("���ѿ����� ��");
		
		//2.���������(2�׿�����)
		int c = 10;
		int d = 3;
		System.out.println("���ϱ�"+(c+d)); // ���� ���ϱ� ���ڴ� �����̴�. �׷��� +�� �ǹ̴� �����̴�.
		System.out.println("����"+(c-d));
		System.out.println("���ϱ�"+c*d);
		System.out.println("������"+c/d); //��
		System.out.println("������"+c%d); //%�� �ǹ̴� ���� ������
		
		//3.�񱳿�����, ���迬����
		System.out.println(c > d);
		System.out.println(c <= d);
		
		//4.�������� : &&(and), ||(or), !(not)
		System.out.println(!(c > d));
		System.out.println(!(c <= d));
		
		String subject = null; // ���� ���� ���ǵ� �ٴ� �����ϴ�.��� �ʱ�ȭ�� ��Ű�� ���Դϴ�. �ϴ� ����� �����ϰ� �ϱ� ���ؼ�
		
		
		System.out.println(subject != null && subject.length() > 10); //���౸�� : ���� Ʋ���� �ڿ� ���� �ʴ´�. (null�� ���̰� ����)
		System.out.println(subject != null || subject.length() > 10); //�տ��� ������ ���� ������ ���� �ʴ´�. 
		//System.out.println(subject != null & subject.length() > 10); // ���� �´� Ʋ���� �ڿ� Ȯ���� �Ѵ�.
		
		//System.out.println(subject == null);
		//System.out.println(subject.length());
		//System.out.println(subject.length() > 10);

	}

}
