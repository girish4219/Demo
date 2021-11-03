package com.jmz.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	String ename;
	int eid;

	Employee(String s, int i) {
		this.ename = s;
		this.eid = i;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + "]";
	}
}

public class ToEncryptData {
	public static void main(String[] args) throws IOException, Exception {
		Employee e = new Employee("giri", 123);
		System.out.println(e);
		FileOutputStream fos = new FileOutputStream("emp.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		FileInputStream fis=new FileInputStream("emp.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e1=(Employee) ois.readObject();
		System.out.println(e1);

	}

}
