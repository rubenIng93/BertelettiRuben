package it.polito.tdp.simulatoreNBA.model;

import java.time.LocalTime;

public class Evento implements Comparable<Evento>{
	
	public enum TipoEvento{
		/*
		 * tentativi
		 */
		FREE_THROW_ATTEMPT,
		THREE_POINTS_ATTEMPT,
		FIELD_GOAL_ATTEMPT,
		
		/*
		 * esito tentativo
		 */
		SUCCESSFUL_ATTEMPT,
		FAILED_ATTEMPT,
		
		/*
		 * cambio giocatori
		 */
		ON_THE_BENCH,
		IN_FIELD
		
	}
	
	private Integer time;
	private TipoEvento type;
	private Player player;
	private Player assistman;
	private Player stopper;
	
	public Evento(Integer time, TipoEvento type, Player player, Player assistman, Player stopper) {
		super();
		this.time = time;
		this.type = type;
		this.player = player;
		this.assistman = assistman;
		this.stopper = stopper;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public TipoEvento getType() {
		return type;
	}

	public void setType(TipoEvento type) {
		this.type = type;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Player getAssistman() {
		return assistman;
	}

	public void setAssistman(Player assistman) {
		this.assistman = assistman;
	}

	public Player getStopper() {
		return stopper;
	}

	public void setStopper(Player stopper) {
		this.stopper = stopper;
	}
	

	@Override
	public String toString() {
		return String.format("Evento -> time = %s, type = %s, player = %s, assistman = %s, stopper = %s\n", time, type,
				player, assistman, stopper);
	}

	@Override
	public int compareTo(Evento o) {
		return this.time.compareTo(o.getTime());
	}
	
	
	
	

}
