package com.encore.day07;

public interface TV {

	//1.���
	int KBS = 7; // public static final ��������
	int SBS=6; // public static final �������� 
	public static final int MBC=11;
	public static final int KBS2=9;
	
	
	//2.�߻�޼���
	public abstract void powerOn();
	void powerOff(); // public abstract ���� ����
	
	//3.default (java8�������� ���� ����)
	
	
	//4.static (java8�������� ���� ����)
}
