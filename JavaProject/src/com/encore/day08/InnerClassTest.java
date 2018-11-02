package com.encore.day08;

public class InnerClassTest {

	
	class OuterClass {
		int a =10; // �ν��Ͻ� ����
		static int b = 20; // ����ƽ ����
		
			//�ν��Ͻ� �̳� Ŭ����
			class InnerClassA{
				int c = 30;
				int d = 40; //�ν��Ͻ� Ŭ���� �ȿ����� ����ƽ ���� ���� �Ұ���
				}
			//����ƽ �̳� Ŭ����
			class InnerClassB{
				int e = 50;
				static int f = 60;
				}	
		
		public void print() {
			int g = 70; //��������(�ż��� �ȿ��ִ� ����)

		}
		
	}
	public static void main(String[] args) {
		OuterClass var1 = new OuterClass();
		System.out.println(var1.a);
		System.out.println(OuterClass.b); //����ƽ �����̱� ������ ��ü ������ ���ص� �ȴ�.
		
		//�̳�Ŭ������ �ƿ�Ŭ������ new�ϰ� �ٽ�new�ؾ� ��밡���ϴ�.
		OuterClass.InnerClassA var2 = new OuterClass().new InnerClassA();
		System.out.println(var2.c);
		
		OuterClass.InnerClassB var2 = new OuterClass.InnerClassB();
		System.out.println(var3.e);
		System.out.println(OuterClass.InnerClassB.f);
	}

}
