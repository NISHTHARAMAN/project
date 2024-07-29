package interfaces;

public class StandardMembership implements Membership {
	
	private String type;
	private double fee ;

	
	public StandardMembership() {
		
		this.type = "Standard";
		this.fee = 40.0;
	}

	@Override
	public void displayMembershipDetails() {
		// TODO Auto-generated method stub
		System.out.println("Membership is "+type+" and privileges is access to cardio and weightlifting equipment.");
		
	}

	@Override
	public double calculateMembershipFee() {
		// TODO Auto-generated method stub
		return fee;
	}

}
