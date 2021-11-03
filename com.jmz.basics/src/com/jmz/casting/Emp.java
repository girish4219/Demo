package com.jmz.casting;

public class Emp {
private int empid;
private String empName;
Emp(int empid,String empName){
	this.empid=empid;
	this.empName=empName;
}
public String toString() {
	return "id is"+empid+"name is"+empName;
}
public static void main(String[] args) {
	Emp e=new Emp(11, "sg");
	System.out.println(e);
	Emp e1=new Emp(12, "sg");
	System.out.println(e1);
}
}
