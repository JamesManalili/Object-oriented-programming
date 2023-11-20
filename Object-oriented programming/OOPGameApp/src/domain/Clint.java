package domain;

public class Clint implements Warrior {
	private String warriorCode;
	private String weapon;
	private Integer bulletsLeft;
	private Integer noOfKills;

	public String getWarriorCode() {
		return warriorCode;
	}

	public void setWarriorCode(String warriorCode) {
		this.warriorCode = warriorCode;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public Integer getBulletsLeft() {
		return bulletsLeft;
	}

	public void setBulletsLeft(Integer bulletsLeft) {
		this.bulletsLeft = bulletsLeft;
	}

	public Integer getNoOfKills() {
		return noOfKills;
	}

	public void setNoOfKills(Integer noOfKills) {
		this.noOfKills = noOfKills;
	}

	@Override
	public String showWarriorAndKills() {
		return "\tClint is using Guns! has "+bulletsLeft+" bullets left and killed "+noOfKills +"\n";
	}

	public String toString() {
		return showWarriorAndKills();
	}
	
	
	

}
