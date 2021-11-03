package com.jmz.collections;

import java.util.TreeSet;

public class TreeSetClass {
public static void main(String[] args) {
	TreeSet<String> t=new TreeSet<String>();
	t.add("a");
	t.add("b");
	t.add("c");
	t.add("d");
	t.add("e");
	TreeSet<String> subtree=new TreeSet<String>();
	subtree=(TreeSet<String>) t.subSet("b", true, "d", true);
	System.out.println(subtree);
	t.add("g");
	t.pollFirst();
	//t.pollFirst();
	System.out.println(t);
	t.add("c2");
	System.out.println(t);
	System.out.println(subtree);
	System.out.println(t.size()+"  "+subtree.size());
}
}
