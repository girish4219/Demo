package com.jmz.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class Emp{
	int empid;
	String empbname;
	String getName() {
		return empbname;
		
	}
	void setName(String name) {
		empbname=name;
	}
	int getId() {
		return empid;
	}
	void setId(int id) {
		empid=id;
	}
	public String toString() {
		return empbname+empid;
	}
}

public class WriteObjectValueToFile {
	public static void main(String[] args) throws IOException {
		File fq = new File("a.txt");
		
		FileWriter fw=new FileWriter(fq);
		
Emp e=new Emp();
e.empid=11;
e.empbname="giri";
System.out.println(e);
fw.write(e.toString());
fw.close();

		
	}
}
