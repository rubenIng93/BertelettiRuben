package it.polito.tdp.simulatoreNBA.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.polito.tdp.simulatoreNBA.db.NBADao;

public class Model {
	
	private List<Team> EastTeams;
	private List<Team> WestTeams;
	private Map<String, Team> winnerTeamMap; 
	private Simulatore sim;
	private Integer winH;
	private Integer winA;
	private List<String> result;
	
	
	
	private NBADao dao;
	
	public Model() {
		
		this.dao = new NBADao();
		this.sim = new Simulatore();
		
		
		this.EastTeams = dao.getEastTeams();
		this.WestTeams = dao.getWestTeams();
		this.winnerTeamMap = new HashMap<String, Team>();
	}
	
	public Team SimulationWinner(Team home, Team away) {
		
		this.winA = 0;
		this.winH = 0;
		
		this.result = new ArrayList<>();
		
		
		for(int i = 1; i <= 7 ; i++) {
			if(winA == 4 || winH == 4) {
				break;
			}else{
				sim.init(home, away);
				sim.run();
				if(sim.getMatch().getWinner().equals(home)) {
					this.winH++;
					String res = this.sim.getMatch().toString();
					this.result.add(res);
				}else {
					this.winA++;
					String res = this.sim.getMatch().toString();
					this.result.add(res);
				}
			}
			
			
		}
		
		if(winA > winH) {
			this.winnerTeamMap.put(away.getAbbreviation(), away);
			return away;
		}
			
		else {
			this.winnerTeamMap.put(home.getAbbreviation(), home);
			return home;
		}
					
		
	}
	


	public List<String> getResult() {
		return result;
	}

	public void setResult(List<String> result) {
		this.result = result;
	}
	
	public String res() {
		return winH + " " + winA;
	}

	public List<Team> getEastTeams() {
		return EastTeams;
	}

	public List<Team> getWestTeams() {
		return WestTeams;
	}

	public Map<String, Team> getWinnerTeamMap() {
		return winnerTeamMap;
	}
	
	
	
	
	
	

}
