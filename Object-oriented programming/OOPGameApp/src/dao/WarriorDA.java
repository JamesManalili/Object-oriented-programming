package dao;

import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import domain.*;

public class WarriorDA {

	private ArrayList<Warrior> warriorList = new ArrayList<Warrior>();

	public WarriorDA(String teamID) throws FileNotFoundException {
		Scanner teamStatInfo = new Scanner(
				new FileReader("C:\\Users\\james\\eclipse-workspace\\GameApp\\src\\teamStatInfo.csv"));
		Clint clint = new Clint();
		while (teamStatInfo.hasNext()) {
			String rowTeamStats = new String();
			rowTeamStats = teamStatInfo.nextLine();
			
			String[] rowTeamStatsSpecific = new String[3];
			rowTeamStatsSpecific = rowTeamStats.split(",");
			
			if (teamID.equals(rowTeamStatsSpecific[0])) {
				if (rowTeamStatsSpecific[1].equals("warrior1")) {
					// clint.setWarriorCode(warrior);
					clint.setBulletsLeft(Integer.parseInt(rowTeamStatsSpecific[2].trim()));
					clint.setNoOfKills(Integer.parseInt(rowTeamStatsSpecific[3].trim()));
					warriorList.add(clint);
				}
				else if(rowTeamStatsSpecific[1].equals("warrior2")) {
					Miya miya = new Miya();
					miya.setArrowsLeft(Integer.parseInt(rowTeamStatsSpecific[2].trim()));
					miya.setNoOfKills(Integer.parseInt(rowTeamStatsSpecific[3].trim()));
					warriorList.add(miya);
				}
				else if(rowTeamStatsSpecific[1].equals("warrior3")) {
					Vexana vexana = new Vexana();
					vexana.setBombsLeft(Integer.parseInt(rowTeamStatsSpecific[2].trim()));
					vexana.setNoOfKills(Integer.parseInt(rowTeamStatsSpecific[3].trim()));
					warriorList.add(vexana);
				}
			}
		}
	}

	public ArrayList<Warrior> getWarriorList() {
		return warriorList;
	}

	public void setWarriorList(ArrayList<Warrior> warriorList) {
		this.warriorList = warriorList;
	}

}
