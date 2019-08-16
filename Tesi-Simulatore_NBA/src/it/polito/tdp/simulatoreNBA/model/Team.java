package it.polito.tdp.simulatoreNBA.model;

import java.util.List;

public class Team {//CLASSE PER TIRARE DENTRO DAL DB I RIFERIMENTI SQUADRA PER PERMETTERE L'INSERIMENTO NEL TABELLONE
	
	private String abbreviation;
	private String name;
	private String conference;
	private List<Player> players;
	
	public Team(String abbreviation, String name, String conference) {
		super();
		this.abbreviation = abbreviation;
		this.name = name;
		this.conference = conference;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConference() {
		return conference;
	}

	public void setConference(String conference) {
		this.conference = conference;
	}	
	

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return abbreviation;
	}
	
	
	
	

}
