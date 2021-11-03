package com.jmz.casting;

public class MainClass {
public static void main(String[] args) {
	int i=(int)1000000000L;
	System.out.println(i);
	A a=new A();
	A a1=new B();
	A a2=new C();
	
	B b=new B();
	B b1=new C();
	
//	C c=new A(); direct downcast is not possible
	
//	C c=(C) a1;
	B b2=(B) a1;
}
}
class A{

}
class B extends A{
	
}
class C extends B{
	
}