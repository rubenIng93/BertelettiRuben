package it.polito.tdp.simulatoreNBA.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import it.polito.tdp.simulatoreNBA.db.NBADao;

public class Model {
	
	private List<IdTeam> EastTeams;
	private List<IdTeam> WestTeams;
	private Map<String, IdTeam> playoffEastTeams;
	private Map<String, IdTeam> playoffWestTeams;
	private NBADao dao;
	
	public Model() {
		
		this.dao = new NBADao();
		this.EastTeams = dao.getEastTeams();
		this.WestTeams = dao.getWestTeams();
		
	}
	
	
	
	/*public Integer checkTeams(IdTeam t1, IdTeam t2, IdTeam t3, IdTeam t4, IdTeam t5,
			IdTeam t6, IdTeam t7, IdTeam t8) {
		
		if(t1.getConference().equals("east")) {
			
			playoffEastTeams.put(t1.getAbbreviation(), t1);
			playoffEastTeams.put(t2.getAbbreviation(), t2);
			playoffEastTeams.put(t3.getAbbreviation(), t3);
			playoffEastTeams.put(t4.getAbbreviation(), t4);
			playoffEastTeams.put(t5.getAbbreviation(), t5);
			playoffEastTeams.put(t6.getAbbreviation(), t6);
			playoffEastTeams.put(t7.getAbbreviation(), t7);
			playoffEastTeams.put(t8.getAbbreviation(), t8);
			
			if(this.playoffEastTeams.keySet().size() != 8) {
				return 1;//CODICE ERRORE EAST
			}
			
		}else {
			
			playoffWestTeams.put(t1.getAbbreviation(), t1);
			playoffWestTeams.put(t2.getAbbreviation(), t2);
			playoffWestTeams.put(t3.getAbbreviation(), t3);
			playoffWestTeams.put(t4.getAbbreviation(), t4);
			playoffWestTeams.put(t5.getAbbreviation(), t5);
			playoffWestTeams.put(t6.getAbbreviation(), t6);
			playoffWestTeams.put(t7.getAbbreviation(), t7);
			playoffWestTeams.put(t8.getAbbreviation(), t8);
			
			if(this.playoffWestTeams.keySet().size() != 8) {
				return 2;//CODICE ERRORE WEST
			}
		}
		
		return 0;//NESSUN ERRORE
		
	}*/

	public List<IdTeam> getEastTeams() {
		return EastTeams;
	}

	public List<IdTeam> getWestTeams() {
		return WestTeams;
	}
	
	
	
	

}
