package it.polito.tdp.simulatoreNBA.controller;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.simulatoreNBA.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FinalsController {
	
	Model model;
	Stage stage;
	
	

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtWestWinner;

    @FXML
    private TextArea txtAreaPlayerStatsW;

    @FXML
    private TextField txtEastWinner;

    @FXML
    private TextArea txtAreaPlayerStatsE;

    @FXML
    private TextField txtChamp;

    @FXML
    private TextArea txtAreaResults;

    @FXML
    void doSimulaFinals(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtWestWinner != null : "fx:id=\"txtWestWinner\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert txtAreaPlayerStatsW != null : "fx:id=\"txtAreaPlayerStatsW\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert txtEastWinner != null : "fx:id=\"txtEastWinner\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert txtAreaPlayerStatsE != null : "fx:id=\"txtAreaPlayerStatsE\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert txtChamp != null : "fx:id=\"txtChamp\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert txtAreaResults != null : "fx:id=\"txtAreaResults\" was not injected: check your FXML file 'GoToFinals.fxml'.";

    }
    
    public void setModel(Model model, Stage stage) {
		this.model = model;
		this.stage = stage;
	}
}
