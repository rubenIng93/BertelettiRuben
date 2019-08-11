package it.polito.tdp.simulatoreNBA.controller;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.simulatoreNBA.model.IdTeam;
import it.polito.tdp.simulatoreNBA.model.Model;
import javafx.fxml.FXML;
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
