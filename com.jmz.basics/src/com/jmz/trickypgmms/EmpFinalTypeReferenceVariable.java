package com.jmz.trickypgmms;

public class EmpFinalTypeReferenceVariable {
	int empId;
	String empName;

	public EmpFinalTypeReferenceVariable(int id, String s) {
		System.out.println(id);
		System.out.println(s);

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public static void main(String[] args) {
		final EmpFinalTypeReferenceVariable e = new EmpFinalTypeReferenceVariable(11, "hi");
//	e=new EmpFinalTypeReferenceVariable(12, "hy");
		e.setEmpName("hy");
	}
}
