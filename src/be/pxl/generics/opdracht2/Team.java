package be.pxl.generics.opdracht2;

import java.util.ArrayList;

public class Team<T extends Player> {

	private String name;
	private int played;
	private int lost;
	private int won;
	private int tied;

	private ArrayList<T> members = new ArrayList<>();

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addPlayer(T player) {
		if (members.contains(player)) {
			System.out.println(player.getName() + " is already on this team");
			return;
		}
		members.add(player);
		System.out.println(player.getName() + " picked for team " + name);
	}

	public int numberOfPlayers() {
		return members.size();
	}
	
	public int ranking() {
		return won * 3 + tied;
	}

	public int getPlayed() {
		return played;
	}

	public int getLost() {
		return lost;
	}

	public int getWon() {
		return won;
	}

	public int getTied() {
		return tied;
	}

	public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
		if (ourScore > theirScore) {
			won++;
		} else if (ourScore == theirScore) {
			tied++;
		} else {
			lost++;
		}
		played++;
		if (opponent != null) {
			opponent.matchResult(null, theirScore, ourScore);
		}
	}
}
