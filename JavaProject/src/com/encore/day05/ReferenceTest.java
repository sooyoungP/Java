package com.encore.day05;

public class ReferenceTest {

	public static int add(int su1, int su2) {
		return su1+su2;
	}
	
	public static void swap(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = a;
	}
	
	public static void swap(int[] arr) { // �ּ��� ����
		int temp;
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp; // �ּҰ� ���޵Ȱ��̱� ������ ���� ����Ǿ� �ִ�.
		//return���� ������ �ּҾȿ��� ����� ���̱� ������ ����� �� �״���̴�.
	}
	
	public static void main(String[] args) {
		int ret = add(10,20);
		System.out.println(ret);
		
		
		int a =3;
		int b =4;
		System.out.println("Before a="+a+" "+"b="+b);
		
		swap(a, b);
		System.out.println("After a="+a+" "+"b="+b);
		//���� ������ �Ұ���
		//=========================================//
		//�ּ��� ������ �����ϴ�.
		int[] arr = new int[2];
		arr[0] = 3;
		arr[1] = 4;
		System.out.println("Before a="+arr[0]+" "+"b="+arr[1]);
		swap(arr);
		System.out.println("After a="+arr[0]+" "+"b="+arr[1]);
		//==================================//
		
		Employee emp = new Employee("12345","�ڼҿ�");
		print(emp);
		System.out.println(emp.dept);
		
	}//main end
	
	static void print(Employee emp2) {//�⺻���� �ƴϸ� ���� �ƴ� �ּҰ� �´�
		System.out.println(emp2.empId);
		System.out.println(emp2.empName);
		emp2.dept = "�����ͺм���";
	}

}//class end
