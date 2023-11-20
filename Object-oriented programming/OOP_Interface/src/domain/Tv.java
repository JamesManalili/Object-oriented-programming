package domain;

public class Tv implements Switch {
	 private Boolean withNetflix;

	    public Boolean getWithNetflix() {
	        return withNetflix;
	    }

	    public void setWithNetflix(Boolean withNetflix) {
	         this.withNetflix = withNetflix;
	    }

	    public String switchOn() {
	        return " is ON! Netflix is installed: " + withNetflix ;
	    }

	    public String switchOff() {
	        return " is OFF! Netflix and chill is not allowed!";
	    }
}
