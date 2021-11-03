package com.jmz.basics;

class A {
	void test() {
		System.out.println("super class method");
	}
}
class B1 extends A{
//	void test() {
//		System.out.println("b1 class method");
//	}
}
class C extends B1{
	void test() {
		System.out.println("c class method");
	}
}

public class MultilevelInherit{
	public static void main(String[] args) {
//		A a[]= {new A(),new B1(),new C()};
//		for(A a1:a) {
//			a1.test();
//		}
		A a=new A();
		//B1 b=new B1();
		C c=new C();
		print(a);
		print(c);
		//print(b);
	}
	
	static void print(A a) {
		a.test();
	}
}