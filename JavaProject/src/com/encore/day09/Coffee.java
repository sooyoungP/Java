package com.encore.day09;

public class Coffee implements Cloneable, Comparable<Coffee> {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	String name;
	int price;
	char size;
	public Coffee(String name, int price, char size) {
		super();
		this.name = name;
		this.price = price;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + ", size=" + size + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + size;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coffee other = (Coffee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	@Override
	public int compareTo(Coffee obj) {
		int result = size - obj.size;
		if(result==0) return price-obj.price;
		return result;
	}
	
	
}
