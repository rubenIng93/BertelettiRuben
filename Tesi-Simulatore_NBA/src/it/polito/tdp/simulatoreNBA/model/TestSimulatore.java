package it.polito.tdp.simulatoreNBA.model;

public class TestSimulatore {

	public static void main(String[] args) {
		
		Model model = new Model();
		
		Simulatore sim = new Simulatore();
		sim.init(model.getWestTeams().get(0), model.getWestTeams().get(1));
		
		System.out.println(sim.getQueue() + "Numero azioni: " + sim.getQueue().size());

	}

}
