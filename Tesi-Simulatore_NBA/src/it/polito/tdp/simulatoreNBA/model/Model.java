package it.polito.tdp.simulatoreNBA.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import it.polito.tdp.simulatoreNBA.db.NBADao;

public class Model {
	
	private List<IdTeam> EastTeams;
	private List<IdTeam> WestTeams;
	/*private Map<String, IdTeam> playoffEastTeams;
	private Map<String, IdTeam> playoffWestTeams;*/
	
	
	private NBADao dao;
	
	public Model() {
		
		this.dao = new NBADao();
		this.EastTeams = dao.getEastTeams();
		this.WestTeams = dao.getWestTeams();
		
	}
	


	public List<IdTeam> getEastTeams() {
		return EastTeams;
	}

	public List<IdTeam> getWestTeams() {
		return WestTeams;
	}
	
	
	
	

}
