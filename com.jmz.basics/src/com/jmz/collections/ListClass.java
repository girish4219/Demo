package com.jmz.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListClass {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add("hello");
	l.add("10");
	l.add("hey");
	l.set(1, "good");
	Iterator it=l.iterator();
	l.forEach(new Consumer<Object>() {

		

		@Override
		public void accept(Object o) {
			// TODO Auto-generated method stub
			System.out.println(o);
		}
	});
	l.forEach(n->System.out.println(n));
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println(l.get(0));
System.out.println(l.size());
	System.out.println(l);
	for (Object o : l) {
		System.out.println(o);
	}
	
//	l.add(1);
	LinkedList ll=new LinkedList();

}
}
