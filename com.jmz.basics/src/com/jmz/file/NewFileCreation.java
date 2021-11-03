package com.jmz.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NewFileCreation {
	public static void main(String[] args) throws IOException {
	File f=new File("test8.txt");
	f.createNewFile();
	//	FileWriter fw = new FileWriter(f);
	f.renameTo(new File("test9.txt"));
	
//	if(f.exists()) {
//		f.delete();
//	}
//		fw.write("hiii\n");
//		fw.write("hello");
//		fw.flush();
//		fw.close();
	}
}
