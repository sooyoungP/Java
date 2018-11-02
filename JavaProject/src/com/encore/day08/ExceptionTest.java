package com.encore.day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//��Ÿ���ͼ���
public class ExceptionTest {

	public static void call(int a, int b) {

		try {
			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			System.out.println(a / b);// �����غ��� 0���� ������ �ȵǱ� ������ exception�� ���� ���α׷��� �����ȴ�.
		} catch (ArithmeticException e) {
			// ���ܰ� �߻��ϸ� �ڵ����� new exception�̶�� ��ü�� ��������� �ٽ� �����ش�.
			// ArithmeticException�� runtimeException�� ��ӹ޾Ұ�, �װ��� Exception�� ��ӹ޾Ҵ�.
			// ������ �߻��ص� ���α׷��� ������� �ʰ� ���������� �귯����.
			System.out.println("������� by zero.....");
		} finally {
			System.out.println("���ܹ߻� ���ο� ������� ������ ó���ȴ�");
		}
		System.out.println("�޼��尡 ����");
	}

	public static void call2() {
		int[] arr = new int[2];

		try {
			arr[0] = 100;
			arr[1] = 30;
			System.out.println(arr[0] / arr[1]);

			Shape s = new Rectangle(3, 4);
			RectTriangle r = (RectTriangle) s;

		} catch (NullPointerException e) {
			System.out.println("�迭�� �������� ����");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index���� ���");
		} catch (ArithmeticException e) {
			System.out.println("/ by zero");
		} catch (ClassCastException e) {
			System.out.println("ClassCastException.......");
		} catch (Exception e) {
			System.out.println(" ��Ÿ  Exception.......");
		}

	}

	public static void call3() {
		// �����Ͻÿ� �ذ��� �ݵ�� �ؾ��ϴ� exception...RuntimeException�̿�
		try {
			Class cc = Class.forName("com.encore.day08.Rectangle2");
			System.out.println(cc.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("�ݵ�� �ؾ��ϴ� �ڵ�:�ڿ��ݳ�");
		}
		System.out.println("method ��");
	}

	public static void call4() {
		try { //����ó���� �ϸ� ���α׷��� �������� �ʴ´�.
		int result = 10/0;
		}catch(Exception aa) {
			
		}
	}
	
	public static void call5() throws IOException { //������ �ҷ��� ������ ���ư���.
		FileInputStream fi = new FileInputStream("src/com/encore/day08/Rectangle.java");
		//InputStream�� ���� �ѹ���Ʈ�� �д´�.
		int i;
		
		while((i = fi.read())!=-1){ //���� -1�̸� ������ �� ������
		System.out.print((char)i);
	}
		fi.close();
	}

	public static void main(String[] args) {
		System.out.println("=========������ ����=========");
		// call(10, 2); // ������ Ÿ�ӿ����� ������ ���� �ʴ´�. �̰��� ��Ÿ���̼����̶�� �Ѵ�.
		
		try {
			call5();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		call2();
		System.out.println("=========������ ��=========");

	}

}
