package interfaces;

public class GymMembershipSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BasicMembership");
		
		BasicMembership bm = new BasicMembership();
		bm.displayMembershipDetails();
		System.out.println(bm.calculateMembershipFee());
		
		System.out.println();
		System.out.println("StandardMembership");
		
		StandardMembership sm = new StandardMembership();
		sm.displayMembershipDetails();
		System.out.println(sm.calculateMembershipFee());
		System.out.println();
		System.out.println("PremiumMembership");
		
		PremiumMembership pm = new PremiumMembership();
		pm.displayMembershipDetails();
		System.out.println(pm.calculateMembershipFee());
	}

}
