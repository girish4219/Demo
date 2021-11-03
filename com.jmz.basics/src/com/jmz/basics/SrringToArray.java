package com.jmz.basics;

import java.util.Arrays;
import java.util.List;

public class SrringToArray {
public static void main(String[] args) {
	String[] a= {"one","two","three","four"};
	
	List l=Arrays.asList(a);
//	System.out.println(l);
	l.set(1,"one");
	System.out.println(l);
	for(String s:a) {
		System.out.println(s);
	}
	a[0]="zero";
	System.out.println(l);
	for(String s:a) {
		System.out.println(s);
	}
}
}
