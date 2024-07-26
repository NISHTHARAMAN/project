package oops;

public class Student {
	//data members are always private
	//default access modifier is 'default'
	
	
	private int rollno;
	private String name;
	
	//member functions
	//always public
	public void getdata() {
		rollno=12;
		name="Pooja";
	}
	
	public void display() {
		System.out.println(name + "  " +rollno);
	}
	
}
