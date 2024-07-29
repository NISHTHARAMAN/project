package interfaces;

public class PremiumMembership implements Membership {
	
	private String type;
	private double fee ;

	
	public PremiumMembership() {
		
		this.type = "Premium";
		this.fee = 50;
	}

	@Override
	public void displayMembershipDetails() {
		// TODO Auto-generated method stub
		System.out.println("Membership is "+type+" and privileges is access to all gym facilities, including cardio, weightlifting, and group classes.");
	}

	@Override
	public double calculateMembershipFee() {
		// TODO Auto-generated method stub
		return fee;
	}

}
