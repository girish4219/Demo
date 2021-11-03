package com.jmz.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapClass {
	static int count=0;
public static void main(String[] args) {
	HashMap<Object,Object> m=new HashMap();
	m.put("1", "10");
	m.put(2, 20);
	m.put(null,89);
	m.put(null, null);
	m.put(2, 30);
	
	System.out.println(m);
	System.out.println(m.get(2));
	Iterator l=m.entrySet().iterator();
	while(l.hasNext())
		System.out.println(l.next());
	//or
	for(Map.Entry me:m.entrySet()) {
		System.out.println(me.getKey());
	}
	//or
	for(var entry : m.entrySet()) {
		System.out.println(entry);
		count++;
	}
	System.out.println(count);
}
}
