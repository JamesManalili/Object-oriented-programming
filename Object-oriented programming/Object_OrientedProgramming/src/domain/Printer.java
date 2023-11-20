package domain;

public class Printer extends Appliance{
	
	public Printer(String applianceID, String appName) {
		super(applianceID, appName);
	}
	
	public Printer() {
		super();
	}

	private int noOfPrints;

	public int getNoOfPrints() {
		return noOfPrints;
	}

	public void setNoOfPrints(int noOfPrints) {
		this.noOfPrints = noOfPrints;
	}

	@Override
	public String switchOn() {
		return (" is ON! You can print pages up to "+getNoOfPrints());
	}

	@Override
	public String switchoff() {
		return " is OFF! You are not allowed to do color printing";
	}
	

}
