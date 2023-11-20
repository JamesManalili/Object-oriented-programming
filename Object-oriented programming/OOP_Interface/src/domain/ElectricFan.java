package domain;

public class ElectricFan implements Switch {
	private Integer noOfSpeeds;

    public Integer getNoOfSpeeds() {
        return noOfSpeeds;
    }

    public void setNoOfSpeeds(Integer noOfSpeeds)
    {
        this.noOfSpeeds = noOfSpeeds;
    }

    public String switchOn() {
                return " is ON! Use  " + noOfSpeeds + " speeds";
    }

    public String switchOff() {
              return  " is OFF! No more noisy electric blades!";
    }
}
