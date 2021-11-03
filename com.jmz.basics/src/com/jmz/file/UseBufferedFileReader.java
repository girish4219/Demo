package com.jmz.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class UseBufferedFileReader {
	public static void main(String[] args) throws IOException {
		String s=null;
		int count=0;
		File f=new File("a.txt");
		f.createNewFile();
		BufferedReader br=new BufferedReader(new FileReader(f));
		while((s=br.readLine()) !=null){
			System.out.println(s);
			count++;
		}
		System.out.println(count);
	}

}
