package org.tnsif.employeemanagement;

public class Designation {
	
	private String Designation,Desc;

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}

	@Override
	public String toString() {
		return "Designation [Designation=" + Designation + ", Desc=" + Desc + "]";
	}

	
	
	

}
