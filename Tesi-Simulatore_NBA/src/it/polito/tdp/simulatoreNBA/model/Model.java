package it.polito.tdp.simulatoreNBA.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import it.polito.tdp.simulatoreNBA.db.NBADao;

public class Model {
	
	private List<Team> EastTeams;
	private List<Team> WestTeams;
	/*private Map<String, IdTeam> playoffEastTeams;
	private Map<String, IdTeam> playoffWestTeams;*/
	
	
	private NBADao dao;
	
	public Model() {
		
		this.dao = new NBADao();
		this.EastTeams = dao.getEastTeams();
		this.WestTeams = dao.getWestTeams();
		
	}
	


	public List<Team> getEastTeams() {
		return EastTeams;
	}

	public List<Team> getWestTeams() {
		return WestTeams;
	}
	
	
	
	

}
