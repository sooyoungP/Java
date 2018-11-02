package com.encore.day10;

public class Product {
	// 변수
	String model;
	int price;
	char size;

	// 생성자
	public Product() {

	}

	public Product(String model, int price, char size) {
		super();
		this.model = model;
		this.price = price;
		this.size = size;
	}

	// setter,getter (public이 아니라면 만들어줘야 한다.)
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

	// 메모리 낭비 적게 만드는법, 더하기로 하면 낭비가 많이 되기 때문에 append를 사용하면 메모리 낭비가 적어진다.
	// 앞으로는 toString 대신에 StringBuilder/butter를 사용하는 것이 좋다.
	// 체인 방식으로 쓰는게 보기 좋다. source => generate to string => StringBuilder/butter -
	// chain call 불러오기.
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [model=").append(model).append(", price=").append(price).append(", size=").append(size)
				.append("]");
		return builder.toString();
	}

}
