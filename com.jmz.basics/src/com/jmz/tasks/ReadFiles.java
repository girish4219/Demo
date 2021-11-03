package com.jmz.tasks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class ReadFiles {
	public static void main(String[] args) throws Exception {
		String s = "null";
		String s1 = "null";
		
		File f = new File("D:\\bankacc.txt");
		File f1 = new File("D:\\banktrans.txt");
		System.out.println("bank account file");
		System.out.println("--------------------------");
		BufferedReader br = new BufferedReader(new FileReader(f));
	
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		System.out.println("--------------------------");
		System.out.println("bank transaction file");
		System.out.println("--------------------------");
		BufferedReader br1 = new BufferedReader(new FileReader(f1));
		while ((s1 = br1.readLine()) != null) {
			System.out.println(s1);
		}
	}
}
