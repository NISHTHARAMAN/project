package oops;

public class demo {

	 private String firstName;
	 private String lastName;
	 private int classYear;
	 private  String major;
	  
	 public demo(String firstName, String lastName, int classYear, String major) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.classYear = classYear;
	    this.major = major;
	  }
	   // Setters
	 
		public String getFirstName() {
			return firstName;
		}
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    
	    public String getLastName() {
			return lastName;
		}

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public int getClassYear() {
			return classYear;
		}
	    
	    public void setClassYear(int classYear) {
	        this.classYear = classYear;
	    }
	    
	    public String getMajor() {
			return major;
		}

	    public void setMajor(String major) {
	        this.major = major;
	    }
	    @Override
	    public String toString() {
	        return firstName + " " + lastName + ", Class of " + classYear + ", Major: " + major;
	    }

	    // Main method to create and print student examples
	    public static void main(String[] args) {
	    	demo student1 = new demo("John", "Doe", 2023, "Computer Science");
	    	demo student2 = new demo("Jane", "Smith", 2024, "Biology");

	        System.out.println(student1);
	        System.out.println(student2);
	    }

	
}
