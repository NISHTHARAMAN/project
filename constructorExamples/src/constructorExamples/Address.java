package constructorExamples;

public class Address {
	
	String socityName,Area;
	int pincode;
	public Address() {
		this.pincode=888;
		this.socityName="fff";
        this.Area="dfsd";

	}
	public Address(String socityName, String area, int pincode) {
		this.socityName = socityName;
	    this.Area = area;
		this.pincode = pincode;
	}

	public String getSocityName() {
		return socityName;
	}

	public void setSocityName(String socityName) {
		this.socityName = socityName;
	}

	public String getArea() {
		return Area;
	}


	public void setArea(String area) {
		Area = area;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [socityName=" + socityName + ", Area=" + Area + ", pincode=" + pincode + "]";
	}
}
