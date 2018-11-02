package com.encore.day10;

public class Box<T> {
	// 변수
	T size; // 가변일 경우에는 T라고 쓴다.T는 사용 할 때 결정된다. 
	//현재는 사이즈만 가변이다.
	String material;
	String color;

	// 생성자
	public Box(T size, String material, String color) {
		super();
		this.size = size;
		this.material = material;
		this.color = color;
	}

	// GETTER & SETTER
	public T getSize() {
		return size;
	}

	public void setSize(T size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Box [size=").append(size).append(", material=").append(material).append(", color=")
				.append(color).append("]");
		return builder.toString();
	}

}
