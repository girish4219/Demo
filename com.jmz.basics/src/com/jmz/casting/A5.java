package com.jmz.casting;

public class A5 {
int i=0;
A5(){
	i++;
}
public static void main(String[] args) {
	new A5();
	new A5();
	System.out.println(new A5().i);
//	System.out.println(A5.i);
}
}
