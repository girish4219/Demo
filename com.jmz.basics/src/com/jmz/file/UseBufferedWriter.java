package com.jmz.file;

import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.logging.ConsoleHandler;

public class UseBufferedWriter {
	public static void main(String[] args) throws IOException {
		FileWriter f1 = new FileWriter("test1.txt");
//	BufferedWriter bw=new BufferedWriter(f1);
//	bw.write("hi");
//	bw.newLine();
//	bw.write("hy");
//	bw.flush();
//	bw.close();
		PrintWriter pw=new PrintWriter(f1);
		pw.println();
	}
}
