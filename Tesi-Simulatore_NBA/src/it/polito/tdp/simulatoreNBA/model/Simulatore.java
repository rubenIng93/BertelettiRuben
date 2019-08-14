package it.polito.tdp.simulatoreNBA.model;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.stream.DoubleStream;

import it.polito.tdp.simulatoreNBA.db.NBADao;

public class Simulatore {
	
	private PriorityQueue<Evento> queue = new PriorityQueue<>();
	private Random rand;
	private Match match;
	private NBADao dao;
	
	//Parametri simulazione
	private final Duration matchDurations = Duration.ofMinutes(48);
	
	
	
	public void init(Team home, Team away) {
		
		this.dao = new NBADao();
		this.rand = new Random();
		
		List<Player> hPlayers = dao.getPlayerByTeam(home.getName());
		List<Player> aPlayers = dao.getPlayerByTeam(away.getName());
		
		home.setPlayers(hPlayers);
		away.setPlayers(aPlayers);
		
		this.match.setAway(away);
		this.match.setHome(home);
		
		LocalTime matchTime = LocalTime.of(0, 0, 0);
		//Durata partita 48 minuti
		while(matchTime.isBefore(matchTime.plus(matchDurations))) {
			
			/*
			 * Metto in coda un'azione in un periodo casuale tra 30s e 60s
			 */
			matchTime = matchTime.plusSeconds((rand.nextInt(30)) + 30);
			
			for(Player homeP : hPlayers) {
				/*
				 * Ogni giocatore prende tiri in base alla media della regular season
				 * impostato attualmente al tra il 70% e 100% in modo randomico
				 */
				Integer attemtp3 = (int) ((((rand.nextInt(30) + 70) * homeP.getThreePointsAttempts()) / 100));
				Integer attempt2 =
				Integer freeT = 
				
			}
			
		}
		
		
		
		
	}
	
	public void run() {
		
	}
	

}
