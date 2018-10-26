package com.encore.day03;

public class ReferenceTypeTest {

	public static void main(String[] args) {
		//참조타입
		int a = 10;
		int b = 10;
		System.out.println(a==b);
		
		String s1 ="자바";
		String s2 ="자바";
		System.out.println(s1==s2); // 주소가 같다
		
		s1 = s1 + "프로그램";
		s2 = s2 + "프로그램";
		System.out.println(s1==s2); // 주소가 다르다. 스트링은 변경이 안되는 값이기 때문에 글씨가 추가되는게 아니라 아예 새로 만든다. 그래서 주소가 변한다.
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1.equals(s2)); //값을 비교하는 코드
		
		System.out.println(s1.toString()); //값을 찍고자 할 떄 사용하는 코드이다.
		
		System.out.println("=====================");
		String s3 =new String("자바");
		String s4 =new String("자바");
		System.out.println(s3==s4); //값은 같으나 주소는 다르다.
		System.out.println(s3.equals(s4)); //값은 같다.
		
		//우리는 보통 값을 비교해서 코딩을 한다.
		
		System.out.println("====================="); // ==는 주소를 비교, equals()내용비교
		String 직책 = "부장" +"님";
		int sal = 5000;
		
		//if(직책 == "부장님") 
		if(직책.equals("부장님")) {
			System.out.println("회사가 어려워요ㅠㅠ고통은 분담해야지요. 이제 월급은 "+ sal*0.9);
		}else {
			System.out.println("회사 어렵지만..." + sal);
		}
		
		String name = "진";
		System.out.println(name);
		System.out.println(name.length());
		
		
		
	}

}
