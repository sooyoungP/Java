package com.encore.day06;

public class Book {
	// 1.�������(field) >> �����͸� �����ϱ� ���Ѱ�
	public String title; // public == �����Ű������ ���ٰ���
	private int price; // private == �� Ŭ���������� ������ ���� (��������/ĸ��ȭ)
	String author; // ���� == ������Ű������ ���ٰ���(default��)

	public static int count; // ��� ��Ű������ ���� ����, static�� bookŬ������ ���� ��� ������Ʈ�� �����Ѵ�.

	// 2. ������ �޼��� ...�ʱ�ȭ�� �����̴�, �⺻���� default �����ڰ� ����.
	public Book() { // public�� ������ ��� ��Ű������ new�� �ȴ�.
		System.out.println("default ������"); // new �� ������ ����
	}

	public Book(String title, int price, String author) {
		this.title = title;
		this.price = price;
		this.author = author;
		System.out.println("arg3 ������");
	}

	public Book(String title, String author) {
		this(title, 50000, author); // �����ڰ� �ٸ������ �����ڸ� ȣ���Ѵ�.
	}

	// getter...���� �б� ����
	public int getPrice() {
		return price;
	}

	// setter...���� �����ϱ� ����
	public void setPrice(int price) {
		this.price = price;
	}

	// 3. �ż���(class���� �ִ� ���) �Լ��� ���� �Ⱦ��� ������ ����. �ݵ�� ���� ���� ���� ���ǰ� �ʿ��ϴ�. ���� �� ���� ������
	// void�̴�. �Ϲ������� �޼���� public
	public void bookInfoPrint() {
		System.out.println("����: " + title);
		System.out.println("����: " + price);
		System.out.println("�۰�: " + author);
		System.out.println("================");
	}

	// 4. instant block
	{
		System.out.println("��ü�� ������ �� ���� ����ȴ�."); // new �� ������ ����
		count++;
	}

	// 5. static block : BookŬ������ ���� ��� ������Ʈ�� �����Ѵ�.
	static {
		System.out.println("class�ε�ÿ� �ѹ� ����ȴ�");
	}
	
	//final => ������, �ѹ��� �Ҵ簡��, ����Ұ�
	//����� �Ǵ� ������ �� �ѹ��� �Ҵ簡��
	//final�� �����Ұ�. �б⸸ ����
	
	
}
