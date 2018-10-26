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
	
	public static void swap(int[] arr) { // 주소의 전달
		int temp;
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp; // 주소가 전달된것이기 때문에 값이 변경되어 있다.
		//return값은 없으나 주소안에서 변경된 것이기 때문에 변경된 값 그대로이다.
	}
	
	public static void main(String[] args) {
		int ret = add(10,20);
		System.out.println(ret);
		
		
		int a =3;
		int b =4;
		System.out.println("Before a="+a+" "+"b="+b);
		
		swap(a, b);
		System.out.println("After a="+a+" "+"b="+b);
		//값의 전달은 불가능
		//=========================================//
		//주소의 전달은 가능하다.
		int[] arr = new int[2];
		arr[0] = 3;
		arr[1] = 4;
		System.out.println("Before a="+arr[0]+" "+"b="+arr[1]);
		swap(arr);
		System.out.println("After a="+arr[0]+" "+"b="+arr[1]);
		//==================================//
		
		Employee emp = new Employee("12345","박소영");
		print(emp);
		System.out.println(emp.dept);
		
	}//main end
	
	static void print(Employee emp2) {//기본형이 아니면 값이 아닌 주소가 온다
		System.out.println(emp2.empId);
		System.out.println(emp2.empName);
		emp2.dept = "빅데이터분석팀";
	}

}//class end
