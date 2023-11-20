package domain;

public class Printer implements Switch {
	private Integer noOfPrints;

    public Integer getNoOfPrints() {
        return noOfPrints;
    }

    public void setNoOfPrints(Integer noOfPrints) {
        this.noOfPrints = noOfPrints;
    }

    public String switchOn() {
        return " is ON!  You can print pages up to " + getNoOfPrints();
    }

    public String switchOff() {
        return " is OFF! You are not allowed to do color printing!";
    }
}
