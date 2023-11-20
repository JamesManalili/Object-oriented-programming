package dao;

import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import domain.Team;

public class TeamDA {
	private ArrayList<Team> teamList = new ArrayList<Team>();

	public TeamDA() throws FileNotFoundException {
		Scanner teamInfo = new Scanner(
				new FileReader("C:\\Users\\james\\eclipse-workspace\\GameApp\\src\\teamInfo.csv"));
		int total = 0;
		Team team = new Team();
		while (teamInfo.hasNext()) {

			String rowTeamInfo = new String();
			rowTeamInfo = teamInfo.nextLine();

			String[] rowTeamSpecific = new String[1];
			rowTeamSpecific = rowTeamInfo.split(",");

			team.setTeamID(rowTeamSpecific[0]);
			team.setTeamName(rowTeamSpecific[1].trim());
			WarriorDA warriorDA = new WarriorDA(team.getTeamID());
			Scanner teamStatInfo = new Scanner(
					new FileReader("C:\\Users\\james\\eclipse-workspace\\GameApp\\src\\teamStatInfo.csv"));
			while (teamStatInfo.hasNext()) {
				String rowTeamKill = new String();
				rowTeamKill = teamStatInfo.nextLine();
				String[] rowTeamKillSpecific = new String[3];
				rowTeamKillSpecific = rowTeamKill.split(",");
				// team.setTeamID(rowTeamKillSpecific[0]);
				// String IDteam = rowTeamKillSpecific[0];
				if (team.getTeamID().equals(rowTeamKillSpecific[0])) {
					total = total + Integer.parseInt(rowTeamKillSpecific[3].trim());
					team.setTotalKills(total);
				}
			}
			teamList.add(team);
			team.setWarriorList(warriorDA.getWarriorList());
			System.out.println(team);
			total = 0;
		}
		teamInfo.close();
	}

	public ArrayList<Team> getTeamList() {
		return teamList;
	}
}
