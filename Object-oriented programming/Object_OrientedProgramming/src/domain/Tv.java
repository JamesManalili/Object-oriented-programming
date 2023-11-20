package domain;

public class Tv extends Appliance {

	public Tv(String applianceID, String appName) {
		super(applianceID, appName);
	}

	public Tv() {
		super();
	}
	private Boolean withNetflix;
	
	
	
	public Boolean getWithNetflix() {
		return withNetflix;
	}

	public void setWithNetflix(Boolean withNetflix) {
		this.withNetflix = withNetflix;
	}

	@Override
	public String switchOn() {
		return " is ON! Netlflix is installed: " + withNetflix;
	}

	@Override
	public String switchoff() {
		return "is OFF! Netflix and chill is not allowed";
	}

}
