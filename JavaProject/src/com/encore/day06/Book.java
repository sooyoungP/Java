package com.encore.day06;

public class Book {
	// 1.멤버변수(field) >> 데이터를 저장하기 위한것
	public String title; // public == 모든패키지에서 접근가능
	private int price; // private == 이 클래스에서만 접근이 가능 (정보은닉/캡슐화)
	String author; // 생략 == 같은패키지에서 접근가능(default값)

	public static int count; // 모든 패키지에서 접근 가능, static은 book클래스로 만든 모든 오브젝트가 공유한다.

	// 2. 생성자 메서드 ...초기화가 목적이다, 기본으로 default 생성자가 제공.
	public Book() { // public이 있으면 모든 패키지에서 new가 된다.
		System.out.println("default 생성자"); // new 할 때마다 실행
	}

	public Book(String title, int price, String author) {
		this.title = title;
		this.price = price;
		this.author = author;
		System.out.println("arg3 생성자");
	}

	public Book(String title, String author) {
		this(title, 50000, author); // 생성자가 다른모양의 생성자를 호출한다.
	}

	// getter...값을 읽기 위해
	public int getPrice() {
		return price;
	}

	// setter...값을 수정하기 위해
	public void setPrice(int price) {
		this.price = price;
	}

	// 3. 매서드(class내에 있는 기능) 함수는 리턴 안쓰면 에러가 난다. 반드시 리턴 값에 대한 정의가 필요하다. 리턴 할 값이 없으면
	// void이다. 일반적으로 메서드는 public
	public void bookInfoPrint() {
		System.out.println("제목: " + title);
		System.out.println("가격: " + price);
		System.out.println("작가: " + author);
		System.out.println("================");
	}

	// 4. instant block
	{
		System.out.println("객체가 생성될 때 마다 수행된다."); // new 할 때마다 실행
		count++;
	}

	// 5. static block : Book클래스로 만든 모든 오브젝트가 공유한다.
	static {
		System.out.println("class로드시에 한번 실행된다");
	}
	
	//final => 마지막, 한번만 할당가능, 변경불가
	//선언시 또는 생성시 딱 한번만 할당가능
	//final은 수정불가. 읽기만 가능
	
	
}
