package com.jmz.basics;

public class A3 {
String s;
String s1;
public static void main(String[] args) {
	A3 a=new A3();
	a.s="hello";
	A3 a1=new A3();
	a1.s="kool";
	A3 a2=new A3();
	A3[] a3= {a,a1};
	for(A3 a4:a3) {
		if(validate(a4)) {
			System.out.println(a4.s);
		}
	}
}
static boolean validate(A3 a) {
	if(a.s==null)
		return false;
	else
		return true;
}
}
