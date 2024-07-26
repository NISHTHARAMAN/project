package circle;

public class circle {

	private double r;
	private final float pi;
	
	public circle() {
		pi=3.14f;
		this.r=4.4;
	}
	
	public final double  getArea() {
		return pi*r*r;
	}
	
	
}
