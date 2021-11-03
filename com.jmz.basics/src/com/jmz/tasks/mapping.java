package com.jmz.tasks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class mapping {
public static void main(String[] args) throws Exception {
	String s="null";
	String s1="";
	int cardno=0;
	String transactiondate="";
	int amt=0;
	HashMap<Integer, String> hs=new HashMap<Integer, String>();
	File f1 = new File("D:\\banktrans.txt");
	BufferedReader br=new BufferedReader(new FileReader(f1));
	while((s=br.readLine())!=null) {
		String temp[]=s.split(",");
		cardno=Integer.parseInt(temp[0]);
		transactiondate=temp[1];
		amt=Integer.parseInt(temp[2]);
		s1=" "+amt+" "+transactiondate;
		for(int i=0;i<10;i++) {
			hs.put(cardno,s1);
		}
	}
	hs.forEach((key,value)->System.out.println(key+" :"+value));
}
}