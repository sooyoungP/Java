package com.encore.day09;

import java.util.Arrays;

public class Car implements Cloneable { // implements Cloneable 복제능력이 생긴다

	// 변수
	private String model;
	private int price;
	String[] acc;

	// 생성자 매서드
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	public Car(String model, int price, String[] acc) {
		super();
		this.model = model;
		this.price = price;
		this.acc = acc;
	}

	// 값을 읽으려면 getter, 수정하려면 setter
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

	// 이클립스에 이미 저장되어 있는 해쉬코드 오버라이딩(훨씬 꼼꼼하고 효율적이게 만들어져있다)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		return result;
	}

	// toString 오버라이딩
	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + ", acc=" + Arrays.toString(acc) + "]";
	}

	// 이클립스에 이미 저장되어 있는 해쉬코드 오버라이딩(훨씬 꼼꼼하고 효율적이게 만들어져있다)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Car c = (Car) super.clone();
		String[] acc2 = new String[acc.length];
		System.arraycopy(acc, 0, acc2, 0, acc.length);
		c.acc = acc2;
		return c;
	} // 얕은 복제

	/*
	 * //equals 오버라이딩
	 * 
	 * @Override public boolean equals(Object obj) { if(!(obj instanceof Car))
	 * return false; //강제 형변환을 할때는 꼭 그전에 확인하는 if문 Car cc = (Car)obj; return price ==
	 * cc.price && model.equals(cc.model); //문자열을 비교 할 떄는 equals사용해야한다. } //hashcode
	 * 오버라이딩/재정의
	 * 
	 * @Override public int hashCode() {
	 * 
	 * return model.hashCode(); //모델이 같으면 해시코드가 똑같이 //return model.hashCode()+price;
	 * //모델과 가격이 같으면 해시코드가 똑같이 }
	 */

}
