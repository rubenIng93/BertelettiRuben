package it.polito.tdp.simulatoreNBA.model;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

import it.polito.tdp.simulatoreNBA.db.NBADao;
import it.polito.tdp.simulatoreNBA.model.Evento.TipoEvento;

public class Simulatore {
	
	private PriorityQueue<Evento> queue = new PriorityQueue<>();
	private Random rand;
	private Match match;
	private Integer idMatch = 0;
	private NBADao dao;
	
	//Parametri simulazione
	private final Integer matchDurations = 48 * 60; //rappresentazione in secondi
	
	
	
	public void init(Team home, Team away) {
		
		this.match = new Match(idMatch, 0, 0, home, away, null);
		
		this.dao = new NBADao();
		this.rand = new Random();
		
		List<Player> hPlayers = dao.getPlayerByTeam(home.getName());
		List<Player> aPlayers = dao.getPlayerByTeam(away.getName());
		
		home.setPlayers(hPlayers);
		away.setPlayers(aPlayers);
		
		this.match.setAway(away);
		this.match.setHome(home);
		
		Integer matchTime = 0;
		//Durata partita 48 minuti
		while(matchTime <= matchDurations) {
			
			/*
			 * Metto in coda un'azione in un periodo casuale tra 30s e 60s
			 */
			
			
			for(Player homeP : hPlayers) {
				/*
				 * Ogni giocatore prende tiri in base alla media della regular season
				 * impostato attualmente al tra il 70% e 100% in modo randomico
				 */
				
				
				//trovare modo per aggiungere assist e stoppote
				Integer attempt3 = (int) ((((rand.nextInt(30) + 70) * homeP.getThreePointsAttempts()) / 100));
				for(int i = 0; i < attempt3; i++) {
					this.queue.add(new Evento(matchTime, TipoEvento.THREE_POINTS_ATTEMPT, homeP, null, null));
					matchTime = matchTime + ((rand.nextInt(15)) + 30);
				}
				
				Integer attempt2 = (int) ((((rand.nextInt(30) + 70) * homeP.getFieldGoalAttempts()) / 100));
				for(int i = 0; i < attempt2; i++) {
					this.queue.add(new Evento(matchTime, TipoEvento.FIELD_GOAL_ATTEMPT, homeP, null, null));
					matchTime = matchTime + ((rand.nextInt(15)) + 30);
				}
				
				Integer freeT = (int) ((((rand.nextInt(30) + 70) * homeP.getFreeThrowsAttempts()) / 100));
				for(int i = 0; i < freeT; i++) {
					this.queue.add(new Evento(matchTime, TipoEvento.FREE_THROW_ATTEMPT, homeP, null, null));
					matchTime = matchTime + ((rand.nextInt(15)) + 30);
				}		
				
			}
			
			for(Player awayP : aPlayers) {
				/*
				 * Ogni giocatore prende tiri in base alla media della regular season
				 * impostato attualmente al tra il 70% e 100% in modo randomico
				 */
				
				
				//trovare modo per aggiungere assist e stoppote
				Integer attempt3 = (int) ((((rand.nextInt(30) + 70) * awayP.getThreePointsAttempts()) / 100));
				for(int i = 0; i < attempt3; i++) {
					this.queue.add(new Evento(matchTime, TipoEvento.THREE_POINTS_ATTEMPT, awayP, null, null));
					matchTime = matchTime + ((rand.nextInt(15)) + 30);
				}
				
				Integer attempt2 = (int) ((((rand.nextInt(30) + 70) * awayP.getFieldGoalAttempts()) / 100));
				for(int i = 0; i < attempt2; i++) {
					this.queue.add(new Evento(matchTime, TipoEvento.FIELD_GOAL_ATTEMPT, awayP, null, null));
					matchTime = matchTime + ((rand.nextInt(15)) + 30);
				}
				
				Integer freeT = (int) ((((rand.nextInt(30) + 70) * awayP.getFreeThrowsAttempts()) / 100));
				for(int i = 0; i < freeT; i++) {
					this.queue.add(new Evento(matchTime, TipoEvento.FREE_THROW_ATTEMPT, awayP, null, null));
					matchTime = matchTime + ((rand.nextInt(15)) + 30);
				}		
				
			}
			
		}
		
		
		
		
	}
	
	public void run() {
		
	}

	public PriorityQueue<Evento> getQueue() {
		return queue;
	}
	
	
	

}
