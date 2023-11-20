package domain;

import java.util.List; 

public class Team {
	private String teamID;
	private String teamName;
	private int totalKills;
	private List<Warrior> warriorList;

	public String getTeamID() {
		return teamID;
	}

	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTotalKills() {
		return totalKills;
	}

	public void setTotalKills(int totalKills) {
		this.totalKills = totalKills;
	}

	public List<Warrior> getWarriorList() {
		return warriorList;
	}

	public void setWarriorList(List<Warrior> warriorList) {
		this.warriorList = warriorList;
	}

	public String toString() {
		String result = new String();
		result += "Team ID: " + teamID + "\n" + "Team Name: " + teamName + "\n" + "Total kill: " + totalKills +"\n";
		for (Warrior warrior : warriorList) {
			result += warrior;
		}
		return result;
	}
}
