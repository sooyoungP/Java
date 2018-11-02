package com.encore.day10;

public class Product {
	// ����
	String model;
	int price;
	char size;

	// ������
	public Product() {

	}

	public Product(String model, int price, char size) {
		super();
		this.model = model;
		this.price = price;
		this.size = size;
	}

	// setter,getter (public�� �ƴ϶�� �������� �Ѵ�.)
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	// �޸� ���� ���� ����¹�, ���ϱ�� �ϸ� ���� ���� �Ǳ� ������ append�� ����ϸ� �޸� ���� ��������.
	// �����δ� toString ��ſ� StringBuilder/butter�� ����ϴ� ���� ����.
	// ü�� ������� ���°� ���� ����. source => generate to string => StringBuilder/butter -
	// chain call �ҷ�����.
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [model=").append(model).append(", price=").append(price).append(", size=").append(size)
				.append("]");
		return builder.toString();
	}

}
