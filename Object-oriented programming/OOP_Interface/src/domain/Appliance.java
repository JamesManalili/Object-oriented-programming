package domain;

public class Appliance {
	 private String applianceID;
	    private String appName;
	    private Switch sw;

	    public String getAppName() {
	        return appName;
	    }

	    public void setAppName(String appName) {
	        this.appName = appName;
	    }

	    public Switch getSw() {
	        return sw;
	    }

	    public void setSw(Switch sw) {
	        this.sw = sw;
	    }

	    public String getApplianceID() {
	        return applianceID;
	    }

	    public void setApplianceID(String applianceID) {
	        this.applianceID = applianceID;
	    }
}
