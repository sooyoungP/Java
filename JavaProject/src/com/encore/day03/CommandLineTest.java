package com.encore.day03;

public class CommandLineTest {

	public static void main(String[] args) {
		System.out.println("=======����� �Ű�����==========");
		
		//for (int i=0; i<args.length; i++) {
			//System.out.println(args[i]);
			
			//�ΰ��� ���ڸ� �޾Ƽ� ��Ģ������ �����Ѵ�.
			if(args.length !=2) {
				System.out.println("Bye");
				return; //�Լ� ������
			}
			int su1 = Integer.parseInt(args[0]);
			int su2 = Integer.parseInt(args[1]);
			System.out.println(su1 + su2);
			System.out.println(su1 + su2);
		}

	}


