package ui;

import java.io.FileNotFoundException;

import dao.TeamDA;
import domain.Clint;

public class TeamReport {

	public TeamReport() throws FileNotFoundException {
		TeamDA teamDA = new TeamDA();
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		new TeamReport();
	}

}
