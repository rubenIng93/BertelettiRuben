package it.polito.tdp.simulatoreNBA.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.simulatoreNBA.model.Team;
import it.polito.tdp.simulatoreNBA.model.Model;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;

public class NBAController {
	
	private Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    

    @FXML
    private ComboBox<Team> cmbBoxWest1;

    @FXML
    private ComboBox<Team> cmbBoxWest8;

    @FXML
    private ComboBox<Team> cmbBoxWest4;

    @FXML
    private ComboBox<Team> cmbBoxWest5;

    @FXML
    private ComboBox<Team> cmbBoxWest3;

    @FXML
    private ComboBox<Team> cmbBoxWest6;

    @FXML
    private ComboBox<Team> cmbBoxWest2;

    @FXML
    private ComboBox<Team> cmbBoxWest7;

    @FXML
    private ComboBox<Team> cmbBoxEast1;

    @FXML
    private ComboBox<Team> cmbBoxEast8;

    @FXML
    private ComboBox<Team> cmbBoxEast4;

    @FXML
    private ComboBox<Team> cmbBoxEast5;

    @FXML
    private ComboBox<Team> cmbBoxEast3;

    @FXML
    private ComboBox<Team> cmbBoxEast6;

    @FXML
    private ComboBox<Team> cmbBoxEast2;

    @FXML
    private ComboBox<Team> cmbBoxEast7;
    
    @FXML
    private TextField txt1vs8West;

    @FXML
    private TextField txt4vs5West;

    @FXML
    private TextField txt3vs6West;

    @FXML
    private TextField txt2vs7West;

    @FXML
    private TextField txtFinalist1West;

    @FXML
    private TextField txtFinalist2West;

    @FXML
    private TextField txtFinalist1East;

    @FXML
    private TextField txtFinalist2East;

    @FXML
    private TextField txt1vs8East;

    @FXML
    private TextField txt4vs5East;

    @FXML
    private TextField txt3vs6East;

    @FXML
    private TextField txt2vs7East;
    
    @FXML
    private TextField txtWestWinner;

    @FXML
    private TextField txtEastWinner;
    
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
    	
    	Team team1 = cmbBoxEast1.getValue();
    	Team team2 = cmbBoxEast2.getValue();
    	Team team3 = cmbBoxEast3.getValue();
    	Team team4 = cmbBoxEast4.getValue();
    	Team team5 = cmbBoxEast5.getValue();
    	Team team6 = cmbBoxEast6.getValue();
    	Team team7 = cmbBoxEast7.getValue();
    	Team team8 = cmbBoxEast8.getValue();
    	
    	List<Team> teams = new ArrayList<Team>();
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
    	for(Team team : teams) {
    		if(team == null) {
    			txtLog.appendText("ERRORE SIMULAZIONE EAST: Selezionare tutti i teams partecipanti ai playoff per procedere.");
    			return;
    		}
    	}
    	
    	/*
    	 * Controllo input -> squadre tutte differenti
    	 */
    	for(Team t1 : teams) {   
    		int count = 0;
    		for(Team t2 : teams) {
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
    	
    	Team team1 = cmbBoxWest1.getValue();
    	Team team2 = cmbBoxWest2.getValue();
    	Team team3 = cmbBoxWest3.getValue();
    	Team team4 = cmbBoxWest4.getValue();
    	Team team5 = cmbBoxWest5.getValue();
    	Team team6 = cmbBoxWest6.getValue();
    	Team team7 = cmbBoxWest7.getValue();
    	Team team8 = cmbBoxWest8.getValue();
    	
    	List<Team> teams = new ArrayList<Team>();
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
    	for(Team team : teams) {
    		if(team == null) {
    			txtLog.appendText("ERRORE SIMULAZIONE WEST: Selezionare tutti i teams partecipanti ai playoff per procedere.");
    			return;
    		}
    	}
    	
    	/*
    	 * Controllo input -> squadre tutte differenti
    	 */
    	for(Team t1 : teams) {   
    		int count = 0;
    		for(Team t2 : teams) {
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
        assert txt1vs8West != null : "fx:id=\"txt1vs8West\" was not injected: check your FXML file 'Table.fxml'.";
        assert txt4vs5West != null : "fx:id=\"txt4vs5West\" was not injected: check your FXML file 'Table.fxml'.";
        assert txt3vs6West != null : "fx:id=\"txt3vs6West\" was not injected: check your FXML file 'Table.fxml'.";
        assert txt2vs7West != null : "fx:id=\"txt2vs7West\" was not injected: check your FXML file 'Table.fxml'.";
        assert txtFinalist1West != null : "fx:id=\"txtFinalist1West\" was not injected: check your FXML file 'Table.fxml'.";
        assert txtFinalist2West != null : "fx:id=\"txtFinalist2West\" was not injected: check your FXML file 'Table.fxml'.";
        assert txtFinalist1East != null : "fx:id=\"txtFinalist1East\" was not injected: check your FXML file 'Table.fxml'.";
        assert txtFinalist2East != null : "fx:id=\"txtFinalist2East\" was not injected: check your FXML file 'Table.fxml'.";
        assert txt1vs8East != null : "fx:id=\"txt1vs8East\" was not injected: check your FXML file 'Table.fxml'.";
        assert txt4vs5East != null : "fx:id=\"txt4vs5East\" was not injected: check your FXML file 'Table.fxml'.";
        assert txt3vs6East != null : "fx:id=\"txt3vs6East\" was not injected: check your FXML file 'Table.fxml'.";
        assert txt2vs7East != null : "fx:id=\"txt2vs7East\" was not injected: check your FXML file 'Table.fxml'.";
        assert txtWestWinner != null : "fx:id=\"txtWestWinner\" was not injected: check your FXML file 'Table.fxml'.";
        assert txtEastWinner != null : "fx:id=\"txtEastWinner\" was not injected: check your FXML file 'Table.fxml'.";
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
