package org.tnsif.employeemanagement;

public class Employee {
	
	private String ename;
	private Designation desig;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Designation getDesig() {
		return desig;
	}
	public void setDesig(Designation desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", desig=" + desig + "]";
	}
	
	

}
