package it.polito.tdp.simulatoreNBA.model;

import java.util.List;

public class Player {
	
	private String name;
	private String team;
	private Integer age;
	private List<Stats> stats;
	
	public Player(String name, String team, Integer age, List<Stats> stats) {
		super();
		this.name = name;
		this.team = team;
		this.age = age;
		this.stats = stats;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Stats> getStats() {
		return stats;
	}

	public void setStats(List<Stats> stats) {
		this.stats = stats;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((stats == null) ? 0 : stats.hashCode());
		result = prime * result + ((team == null) ? 0 : team.hashCode());
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
		Player other = (Player) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stats == null) {
			if (other.stats != null)
				return false;
		} else if (!stats.equals(other.stats))
			return false;
		if (team == null) {
			if (other.team != null)
				return false;
		} else if (!team.equals(other.team))
			return false;
		return true;
	}
	
	
	
	

}
