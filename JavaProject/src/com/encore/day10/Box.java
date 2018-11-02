package com.encore.day10;

public class Box<T> {
	// ����
	T size; // ������ ��쿡�� T��� ����.T�� ��� �� �� �����ȴ�. 
	//����� ����� �����̴�.
	String material;
	String color;

	// ������
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
