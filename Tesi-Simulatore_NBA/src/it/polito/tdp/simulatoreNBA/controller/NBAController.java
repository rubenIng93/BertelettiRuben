package it.polito.tdp.simulatoreNBA.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.simulatoreNBA.model.IdTeam;
import it.polito.tdp.simulatoreNBA.model.Model;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.ComboBox;

public class NBAController {
	
	private Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    

    @FXML
    private ComboBox<IdTeam> cmbBoxWest1;

    @FXML
    private ComboBox<IdTeam> cmbBoxWest8;

    @FXML
    private ComboBox<IdTeam> cmbBoxWest4;

    @FXML
    private ComboBox<IdTeam> cmbBoxWest5;

    @FXML
    private ComboBox<IdTeam> cmbBoxWest3;

    @FXML
    private ComboBox<IdTeam> cmbBoxWest6;

    @FXML
    private ComboBox<IdTeam> cmbBoxWest2;

    @FXML
    private ComboBox<IdTeam> cmbBoxWest7;

    @FXML
    private ComboBox<IdTeam> cmbBoxEast1;

    @FXML
    private ComboBox<IdTeam> cmbBoxEast8;

    @FXML
    private ComboBox<IdTeam> cmbBoxEast4;

    @FXML
    private ComboBox<IdTeam> cmbBoxEast5;

    @FXML
    private ComboBox<IdTeam> cmbBoxEast3;

    @FXML
    private ComboBox<IdTeam> cmbBoxEast6;

    @FXML
    private ComboBox<IdTeam> cmbBoxEast2;

    @FXML
    private ComboBox<IdTeam> cmbBoxEast7;
    
    @FXML
    private TextArea txtLog;
    
    @FXML
    private Button btn4West;

    @FXML
    private Button btn2West;

    @FXML
    private Button btnFinalsWest;

    @FXML
    private Button btnToFinals;

    @FXML
    private Button btnFinalsEast;

    @FXML
    private Button btn2East;

    @FXML
    private Button btn4East;
    


    @FXML
    void doReset(ActionEvent event) {
    	
    	

    }

    @FXML
    void doGoToFinals(ActionEvent event) {

    }

    @FXML
    void doSimula2East(ActionEvent event) {

    }

    @FXML
    void doSimula2West(ActionEvent event) {

    }

    @FXML
    void doSimula4East(ActionEvent event) {
    	
    	txtLog.clear();
    	
    	IdTeam team1 = cmbBoxEast1.getValue();
    	IdTeam team2 = cmbBoxEast2.getValue();
    	IdTeam team3 = cmbBoxEast3.getValue();
    	IdTeam team4 = cmbBoxEast4.getValue();
    	IdTeam team5 = cmbBoxEast5.getValue();
    	IdTeam team6 = cmbBoxEast6.getValue();
    	IdTeam team7 = cmbBoxEast7.getValue();
    	IdTeam team8 = cmbBoxEast8.getValue();
    	
    	List<IdTeam> teams = new ArrayList<IdTeam>();
    	teams.add(team1);
    	teams.add(team2);
    	teams.add(team3);
    	teams.add(team4);
    	teams.add(team5);
    	teams.add(team6);
    	teams.add(team7);
    	teams.add(team8);
    	
    	/*
    	 * Controllo input -> tutte le squadre selezionate
    	 */
    	for(IdTeam team : teams) {
    		if(team == null) {
    			txtLog.appendText("ERRORE SIMULAZIONE EAST: Selezionare tutti i teams partecipanti ai playoff per procedere.");
    			return;
    		}
    	}
    	
    	/*
    	 * Controllo input -> squadre tutte differenti
    	 */
    	for(IdTeam t1 : teams) {   
    		int count = 0;
    		for(IdTeam t2 : teams) {
    			if(t1.equals(t2)) {
    				count ++;
    				if(count > 1) {
    					txtLog.appendText("ERRORE SIMULAZIONE EAST: Assicurarsi di aver selezionato ogni squadra una sola volta.");
        				return;
    				}
    			}
    		}
    		
    	}

    }

    @FXML
    void doSimulaFinalsEast(ActionEvent event) {

    }

    @FXML
    void doSimulaFinalsWest(ActionEvent event) {

    }

    @FXML
    void simula4West(ActionEvent event) {
    	
    	txtLog.clear();
    	
    	IdTeam team1 = cmbBoxWest1.getValue();
    	IdTeam team2 = cmbBoxWest2.getValue();
    	IdTeam team3 = cmbBoxWest3.getValue();
    	IdTeam team4 = cmbBoxWest4.getValue();
    	IdTeam team5 = cmbBoxWest5.getValue();
    	IdTeam team6 = cmbBoxWest6.getValue();
    	IdTeam team7 = cmbBoxWest7.getValue();
    	IdTeam team8 = cmbBoxWest8.getValue();
    	
    	List<IdTeam> teams = new ArrayList<IdTeam>();
    	teams.add(team1);
    	teams.add(team2);
    	teams.add(team3);
    	teams.add(team4);
    	teams.add(team5);
    	teams.add(team6);
    	teams.add(team7);
    	teams.add(team8);
    	
    	/*
    	 * Controllo input -> tutte le squadre selezionate
    	 */
    	for(IdTeam team : teams) {
    		if(team == null) {
    			txtLog.appendText("ERRORE SIMULAZIONE WEST: Selezionare tutti i teams partecipanti ai playoff per procedere.");
    			return;
    		}
    	}
    	
    	/*
    	 * Controllo input -> squadre tutte differenti
    	 */
    	for(IdTeam t1 : teams) {   
    		int count = 0;
    		for(IdTeam t2 : teams) {
    			if(t1.equals(t2)) {
    				count ++;
    				if(count > 1) {
    					txtLog.appendText("ERRORE SIMULAZIONE WEST: Assicurarsi di aver selezionato ogni squadra una sola volta.");
        				return;
    				}
    			}
    		}
    		
    	}
    	
    	

    }

    @FXML
    void initialize() {
        assert cmbBoxWest1 != null : "fx:id=\"cmbBoxWest1\" was not injected: check your FXML file 'Table.fxml'.";
        assert cmbBoxWest8 != null : "fx:id=\"cmbBoxWest8\" was not injected: check your FXML file 'Table.fxml'.";
        assert cmbBoxWest4 != null : "fx:id=\"cmbBoxWest4\" was not injected: check your FXML file 'Table.fxml'.";
        assert cmbBoxWest5 != null : "fx:id=\"cmbBoxWest5\" was not injected: check your FXML file 'Table.fxml'.";
        assert cmbBoxWest3 != null : "fx:id=\"cmbBoxWest3\" was not injected: check your FXML file 'Table.fxml'.";
        assert cmbBoxWest6 != null : "fx:id=\"cmbBoxWest6\" was not injected: check your FXML file 'Table.fxml'.";
        assert cmbBoxWest2 != null : "fx:id=\"cmbBoxWest2\" was not injected: check your FXML file 'Table.fxml'.";
        assert cmbBoxWest7 != null : "fx:id=\"cmbBoxWest7\" was not injected: check your FXML file 'Table.fxml'.";
        assert cmbBoxEast1 != null : "fx:id=\"cmbBoxEast1\" was not injected: check your FXML file 'Table.fxml'.";
        assert cmbBoxEast8 != null : "fx:id=\"cmbBoxEast8\" was not injected: check your FXML file 'Table.fxml'.";
        assert cmbBoxEast4 != null : "fx:id=\"cmbBoxEast4\" was not injected: check your FXML file 'Table.fxml'.";
        assert cmbBoxEast5 != null : "fx:id=\"cmbBoxEast5\" was not injected: check your FXML file 'Table.fxml'.";
        assert cmbBoxEast3 != null : "fx:id=\"cmbBoxEast3\" was not injected: check your FXML file 'Table.fxml'.";
        assert cmbBoxEast6 != null : "fx:id=\"cmbBoxEast6\" was not injected: check your FXML file 'Table.fxml'.";
        assert cmbBoxEast2 != null : "fx:id=\"cmbBoxEast2\" was not injected: check your FXML file 'Table.fxml'.";
        assert cmbBoxEast7 != null : "fx:id=\"cmbBoxEast7\" was not injected: check your FXML file 'Table.fxml'.";
        assert txtLog != null : "fx:id=\"txtLog\" was not injected: check your FXML file 'Table.fxml'.";
        assert btn4West != null : "fx:id=\"btn4West\" was not injected: check your FXML file 'Table.fxml'.";
        assert btn2West != null : "fx:id=\"btn2West\" was not injected: check your FXML file 'Table.fxml'.";
        assert btnFinalsWest != null : "fx:id=\"btnFinalsWest\" was not injected: check your FXML file 'Table.fxml'.";
        assert btnToFinals != null : "fx:id=\"btnToFinals\" was not injected: check your FXML file 'Table.fxml'.";
        assert btnFinalsEast != null : "fx:id=\"btnFinalsEast\" was not injected: check your FXML file 'Table.fxml'.";
        assert btn2East != null : "fx:id=\"btn2East\" was not injected: check your FXML file 'Table.fxml'.";
        assert btn4East != null : "fx:id=\"btn4East\" was not injected: check your FXML file 'Table.fxml'.";

    }
    
    public void setModel(Model model) {
    	this.model = model;
    	this.cmbBoxEast1.getItems().addAll(model.getEastTeams());
    	this.cmbBoxEast2.getItems().addAll(model.getEastTeams());
    	this.cmbBoxEast3.getItems().addAll(model.getEastTeams());
    	this.cmbBoxEast4.getItems().addAll(model.getEastTeams());
    	this.cmbBoxEast5.getItems().addAll(model.getEastTeams());
    	this.cmbBoxEast6.getItems().addAll(model.getEastTeams());
    	this.cmbBoxEast7.getItems().addAll(model.getEastTeams());
    	this.cmbBoxEast8.getItems().addAll(model.getEastTeams());
    	this.cmbBoxWest1.getItems().addAll(model.getWestTeams());
    	this.cmbBoxWest2.getItems().addAll(model.getWestTeams());
    	this.cmbBoxWest3.getItems().addAll(model.getWestTeams());
    	this.cmbBoxWest4.getItems().addAll(model.getWestTeams());
    	this.cmbBoxWest5.getItems().addAll(model.getWestTeams());
    	this.cmbBoxWest6.getItems().addAll(model.getWestTeams());
    	this.cmbBoxWest7.getItems().addAll(model.getWestTeams());
    	this.cmbBoxWest8.getItems().addAll(model.getWestTeams());
    }
}
