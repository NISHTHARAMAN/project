package oops;

public class Employee {
	
	
		private String name,email,desig,address;
		private int salary;
		
	
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getDesig() {
			return desig;
		}
		public void setDesig(String desig) {
			this.desig = desig;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", email=" + email + ", desig=" + desig + ", address=" + address + ", salary="
					+ salary + "]";
		}
		
		
		

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
