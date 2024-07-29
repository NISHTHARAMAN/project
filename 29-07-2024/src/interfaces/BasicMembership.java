package interfaces;

public class BasicMembership implements Membership {
	
	private String type;
	private double fee ;
	
	

	public BasicMembership() {
		
		this.type = "Basic";
		this.fee = 60.10;
	}

	@Override
	public void displayMembershipDetails() {
		System.out.println("Membership is "+type+" and privileges is access to cardio equipment only.");

	}

	@Override
	public double calculateMembershipFee() {
		// TODO Auto-generated method stub
		return fee;
	}

}
