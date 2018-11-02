package com.encore.day09;

//JavaBeans ��� �԰ݼ�
//��������� ���� �����ڸ� private�� �Ѵ�.
//default �����ڴ� �ʼ��̴�
//�ܺο��� ����Ϸ��� getter,setter�� �������Ѵ�.
public class Person {
	// �������
	private String name;
	private String gender;
	private int age;

	// default ������
	public Person() {

	}

	// ������ �ż���
	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	// getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// toString ������
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Person))
			return false;

		Person p = (Person) obj;

		return age == p.age && name.equals(p.name) && gender.equals(p.gender);
	}

}
