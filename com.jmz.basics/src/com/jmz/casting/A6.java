package com.jmz.casting;

public class A6 {
	int i = 10;

	void d(int i) {
		System.out.println("int type");
	}

	void d(Integer i) {
		System.out.println("Integer class type");
	}

	public static void main(String[] args) {
		A6 a = new A6();
		a.d(10);
		
	}
}
