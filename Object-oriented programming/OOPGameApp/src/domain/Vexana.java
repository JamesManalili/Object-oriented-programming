package domain;

public class Vexana implements Warrior {
	private String warriorCode;
	private String weapon;
	private int bombsLeft;
	private int noOfKills;

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

	public int getBombsLeft() {
		return bombsLeft;
	}

	public void setBombsLeft(Integer bombsLeft) {
		this.bombsLeft = bombsLeft;
	}

	public int getNoOfKills() {
		return noOfKills;
	}

	public void setNoOfKills(int noOfKills) {
		this.noOfKills = noOfKills;
	}

	@Override
	public String showWarriorAndKills() {
		return "\tVexana is using Bombs! has "+bombsLeft+" bombs left and killed "+noOfKills +"\n";
	}
	
	public String toString() {
		return showWarriorAndKills();
	}

}
