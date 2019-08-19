package it.polito.tdp.simulatoreNBA.model;

public class TestModel {

	public static void main(String[] args) {
		
		Model model = new Model();
		
		model.SimulationWinner(model.getWestTeams().get(4), model.getWestTeams().get(7));
		
		for(PlayerAVGStats pas : model.getPlayersStats().values()) {
			model.faiMedia(pas);
		}

	}

}
