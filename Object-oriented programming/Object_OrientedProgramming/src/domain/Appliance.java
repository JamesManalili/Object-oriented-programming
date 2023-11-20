package domain;

public abstract class Appliance {
	private String applianceID;
	private String appName;
	

	public Appliance(String applianceID, String appName) {
		this.applianceID = applianceID;
		this.appName = appName;
	}
	public Appliance() {
		super();
	}

	public String getApplianceID() {
		return applianceID;
	}

	public void setApplianceID(String applianceID) {
		this.applianceID = applianceID;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public abstract String switchOn();

	public abstract String switchoff();
}
