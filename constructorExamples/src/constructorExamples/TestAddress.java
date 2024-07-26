package constructorExamples;

public class TestAddress {

	public static void main(String[] args) {
		Address ad = new Address();
		ad.setSocityName("Raviraj");
		ad.setPincode(382350);
		System.out.println(ad);
		
		Address ad1 = new Address("Gopal Chowk","new naroda",382350);
		System.out.println(ad1);

	}

}
