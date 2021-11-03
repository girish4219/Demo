package com.jmz.tasks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintDetailsByBank {
	
	static void icici() throws Exception {
		String name="";
		int age=0;
		String gender="";
		String bankname;
		int cardno=0;
		int amt=0;
		String s=null;
		File f = new File("D:\\bankacc.txt");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter bank name");
		 String bankname1=sc.next();
		 BufferedReader br=new BufferedReader(new FileReader(f));
		 while((s=br.readLine())!=null) {
			 String temp[]=s.split(",");
			if(bankname1.equalsIgnoreCase(temp[3])) {
				name=temp[0];
				age=Integer.parseInt(temp[1]);
				gender=temp[2];
				bankname=temp[3];
				amt=Integer.parseInt(temp[4]);
				ArrayList<Object> al=new ArrayList<Object>();
				al.add(temp[0]);
				al.add(temp[1]);
				al.add(temp[2]);
				al.add(temp[3]);
				al.add(temp[4]);
				System.out.println(al);
			}
		 }
	}
	public static void main(String[] args) throws Exception {
		icici();
	}
}
