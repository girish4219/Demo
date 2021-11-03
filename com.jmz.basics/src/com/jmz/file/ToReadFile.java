package com.jmz.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ToReadFile {
	public static void main(String[] args) throws IOException {
		char[] data=new char[3];
		FileReader fr=new FileReader("Examplefile.txt");
		int size=fr.read(data);
		System.out.println(size);		
		for(char c:data) {
			System.out.println(c);
		}
		fr.close();
		
	}

}
