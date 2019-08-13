package it.polito.tdp.simulatoreNBA.model;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

import it.polito.tdp.simulatoreNBA.db.NBADao;

public class Simulatore {
	
	private PriorityQueue<Evento> queue = new PriorityQueue<>();
	private Random rand;
	private Match match;
	private NBADao dao;
	
	
	
	public void init(Team home, Team away) {
		
		this.dao = new NBADao();
		this.rand = new Random();
		
		List<Player> hPlayers = dao.getPlayerByTeam(home.getName());
		List<Player> aPlayers = dao.getPlayerByTeam(away.getName());
		
		home.setPlayers(hPlayers);
		away.setPlayers(aPlayers);
		
		this.match.setAway(away);
		this.match.setHome(home);
		
		
	}
	
	public void run() {
		
	}
	

}
