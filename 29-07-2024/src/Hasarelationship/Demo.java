package Hasarelationship;

public class Demo {

	public static void main(String[]args) {
		
		Address add = new Address();
		add.setHouseno(16);
		add.setSocietyname("Raviraj");
		add.setArea("New Naroda");
		add.setPincode(382350);
		
		Person p = new Person();
		p.setAddress(add);
		p.setName("Nishant");
		p.setEmail("niiii@gmail.com");
		
	}
}
