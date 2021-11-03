package com.jmz.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ToPrintCountOfMultipleFiles {
	public static void main(String[] args) throws FileNotFoundException {
		
		File f=new File("C:\\Program Files");
		String[] files=f.list();
		int count=0;
		for(String s:files) {
			System.out.println(s);
			count++;
		}
		System.out.println(count);
	}
}
