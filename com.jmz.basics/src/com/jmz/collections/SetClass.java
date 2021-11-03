package com.jmz.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class SetClass1 {

}

public class SetClass {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(3);
		s.add(1);
		s.add("hi");
		s.add(true);
		s.add(1);
		System.out.println(s);
		Set s1=new LinkedHashSet(s);
		s1.add(3);
		s1.add("ss");
		s1.add(1);
		s1.add(true);
		System.out.println(s1);
		TreeSet s2=new TreeSet();
		s2.add("X");
		s2.add("f");
		System.out.println(s2);
		
		System.out.println(s2.ceiling("K"));
//		s2.add(2);
		System.out.println(s2.pollLast());
		System.out.println(s2.pollFirst());
		System.out.println(s2);
		
	}
}
