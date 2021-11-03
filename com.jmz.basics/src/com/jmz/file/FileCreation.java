package com.jmz.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) throws IOException {
		String filename="Examplefiles.txt";
		File file=new File(filename);
	file.setReadOnly();
//		file.exists();
		try {
			boolean check=file.createNewFile();
			if(check){
				System.out.println("file created");
			}
			else
			{
				System.out.println("file exists already");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			String filename1="Examplefile"+i+".txt";
			File file1=new File(filename1);
			file1.createNewFile();
		}
	File f=new File("Examplenewfile.txt");
	FileWriter fw=new FileWriter("Examplenewfile.txt");
	}

}
