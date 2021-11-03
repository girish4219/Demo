package com.jmz.encapsulation;

public class A {
	private String aname;
	private String bname;
	public String getName() {
		if(aname==null)
			return "null not allowed";
		else
			return aname;
	}
	public void setName(String a) {
		aname=a;
	}
	public static void main(String[] args) {
		A a=new A();
		a.setName("hy");
		System.out.println(a.getName());
	}
}
