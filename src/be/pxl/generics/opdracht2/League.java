package be.pxl.generics.opdracht2;

import java.util.ArrayList;

public class League<T extends Player> {

	private ArrayList<Team<T>> teams = new ArrayList<>();

	public void addTeam(Team<T> team) {

		if (teams.contains(team)) {
			System.out.println(team.getName() + " is already in this league");
			return;
		}
		teams.add(team);
		System.out.println(team.getName() + " particiting in this league");

	}
	
	public void printTeams() {
		for (Team<?> team : teams) {
			System.out.println(team.getName() + " " + team.ranking());
		}
	}
}
