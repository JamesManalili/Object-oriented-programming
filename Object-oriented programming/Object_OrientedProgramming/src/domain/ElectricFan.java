package domain;

public class ElectricFan extends Appliance {

 public ElectricFan(String applianceID, String appName) {
		super(applianceID, appName);
	}
 
 public ElectricFan() {
	 super();
 }

	public int getNoOfSpeed() {
		return noOfSpeed;
	}

	public void setNoOfSpeed(int noOfSpeed) {
		this.noOfSpeed = noOfSpeed;
	}

	private int noOfSpeed;

	@Override
	public String switchOn() {
		return " is ON! Use " + noOfSpeed + " speeds";
	}

	@Override
	public String switchoff() {
		return " is OFF! no more noisy electric blades";
	}

}
