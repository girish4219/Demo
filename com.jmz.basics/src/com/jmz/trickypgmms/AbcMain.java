package com.jmz.trickypgmms;
class Abc{
	Abc(String s){
		System.out.println("B");
	}
}
public class AbcMain extends Abc {
public AbcMain(String d) {
	super(d);
	System.out.println("D");
	
}

public static void main(String[] args) {
	AbcMain a=new AbcMain("c");
	System.out.println(" ");
	
}
}
