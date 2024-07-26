package constructorExamples;

public class Student {
 
	public String sName;

	public Student(String sName) {
		super();
		this.sName = sName;
	}
	
	public Student() {
		this.sName="Rutu";
	}
public static void main(String[] args) {
	
	Student s = new Student("Nishant");
	
		
	}
}
