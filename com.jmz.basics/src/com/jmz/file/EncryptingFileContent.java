package com.jmz.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EncryptingFileContent {
	public static void main(String[] args) throws Exception {
		File f = new File("a.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("im a girish");
		fw.close();
	}
}
