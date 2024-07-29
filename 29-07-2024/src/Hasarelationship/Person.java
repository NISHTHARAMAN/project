package Hasarelationship;

public class Person {
	
	private String Name,email;
	private Address address;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address add) {
		this.address = add;
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", email=" + email + ", address=" + address + "]";
	}
	
	

}
