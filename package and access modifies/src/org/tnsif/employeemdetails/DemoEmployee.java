package org.tnsif.employeemdetails;

import org.tnsif.employeemanagement.*;

public class DemoEmployee {

	public static void main(String[] args) {
		 Designation dag = new Designation();
		 
		 dag.setDesignation("Developer");
		 dag.setDesc("java dev");
		 
		 Employee e = new Employee();
		 e.setEname("Nishant");
		 e.setDesig(dag);
		 System.out.println(e);
	}

}
