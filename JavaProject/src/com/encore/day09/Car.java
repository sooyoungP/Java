package com.encore.day09;

import java.util.Arrays;

public class Car implements Cloneable { // implements Cloneable �����ɷ��� �����

	// ����
	private String model;
	private int price;
	String[] acc;

	// ������ �ż���
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

	// ���� �������� getter, �����Ϸ��� setter
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

	// ��Ŭ������ �̹� ����Ǿ� �ִ� �ؽ��ڵ� �������̵�(�ξ� �Ĳ��ϰ� ȿ�����̰� ��������ִ�)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		return result;
	}

	// toString �������̵�
	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + ", acc=" + Arrays.toString(acc) + "]";
	}

	// ��Ŭ������ �̹� ����Ǿ� �ִ� �ؽ��ڵ� �������̵�(�ξ� �Ĳ��ϰ� ȿ�����̰� ��������ִ�)
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
	} // ���� ����

	/*
	 * //equals �������̵�
	 * 
	 * @Override public boolean equals(Object obj) { if(!(obj instanceof Car))
	 * return false; //���� ����ȯ�� �Ҷ��� �� ������ Ȯ���ϴ� if�� Car cc = (Car)obj; return price ==
	 * cc.price && model.equals(cc.model); //���ڿ��� �� �� ���� equals����ؾ��Ѵ�. } //hashcode
	 * �������̵�/������
	 * 
	 * @Override public int hashCode() {
	 * 
	 * return model.hashCode(); //���� ������ �ؽ��ڵ尡 �Ȱ��� //return model.hashCode()+price;
	 * //�𵨰� ������ ������ �ؽ��ڵ尡 �Ȱ��� }
	 */

}
