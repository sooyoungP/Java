package com.encore.day03;

public class ReferenceTypeTest {

	public static void main(String[] args) {
		//����Ÿ��
		int a = 10;
		int b = 10;
		System.out.println(a==b);
		
		String s1 ="�ڹ�";
		String s2 ="�ڹ�";
		System.out.println(s1==s2); // �ּҰ� ����
		
		s1 = s1 + "���α׷�";
		s2 = s2 + "���α׷�";
		System.out.println(s1==s2); // �ּҰ� �ٸ���. ��Ʈ���� ������ �ȵǴ� ���̱� ������ �۾��� �߰��Ǵ°� �ƴ϶� �ƿ� ���� �����. �׷��� �ּҰ� ���Ѵ�.
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1.equals(s2)); //���� ���ϴ� �ڵ�
		
		System.out.println(s1.toString()); //���� ����� �� �� ����ϴ� �ڵ��̴�.
		
		System.out.println("=====================");
		String s3 =new String("�ڹ�");
		String s4 =new String("�ڹ�");
		System.out.println(s3==s4); //���� ������ �ּҴ� �ٸ���.
		System.out.println(s3.equals(s4)); //���� ����.
		
		//�츮�� ���� ���� ���ؼ� �ڵ��� �Ѵ�.
		
		System.out.println("====================="); // ==�� �ּҸ� ��, equals()�����
		String ��å = "����" +"��";
		int sal = 5000;
		
		//if(��å == "�����") 
		if(��å.equals("�����")) {
			System.out.println("ȸ�簡 �������Фа����� �д��ؾ�����. ���� ������ "+ sal*0.9);
		}else {
			System.out.println("ȸ�� �������..." + sal);
		}
		
		String name = "��";
		System.out.println(name);
		System.out.println(name.length());
		
		
		
	}

}
