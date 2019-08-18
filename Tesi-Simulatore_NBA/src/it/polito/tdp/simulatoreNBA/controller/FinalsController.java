package it.polito.tdp.simulatoreNBA.controller;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.simulatoreNBA.model.Model;
import it.polito.tdp.simulatoreNBA.model.Team;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
    private TableView<?> tableWest;

    @FXML
    private TableColumn<?, ?> columnPlayerWest;

    @FXML
    private TableColumn<?, ?> columnPointsWest;

    @FXML
    private TableColumn<?, ?> columnAssistsWest;

    @FXML
    private TableColumn<?, ?> columnStopWest;

   /* @FXML
    private TextArea txtAreaPlayerStatsW;*/

    @FXML
    private TextField txtEastWinner;
    
    @FXML
    private TableView<?> tableEast;

    @FXML
    private TableColumn<?, ?> columnPlayerEast;

    @FXML
    private TableColumn<?, ?> columnPointsEast;

    @FXML
    private TableColumn<?, ?> columnAssistsEast;

    @FXML
    private TableColumn<?, ?> columnStopEast;


   /* @FXML
    private TextArea txtAreaPlayerStatsE;*/

    @FXML
    private TextField txtChamp;

    @FXML
    private TextArea txtAreaResults;

    @FXML
    void doSimulaFinals(ActionEvent event) {
    	
    	/*txtAreaPlayerStatsE.clear();
    	txtAreaPlayerStatsW.clear();*/
    	txtAreaResults.clear();
    	txtChamp.clear();
    	
    	Team champ = model.SimulationWinner(model.getEastWinner(), model.getWestWinner());
    	
    	txtChamp.appendText(champ.getName());
    	
    	for(String s : model.getResult()) {
    		txtAreaResults.appendText(s + "\n");
    	}
    	

    }

    @FXML
    void initialize() {
        assert txtWestWinner != null : "fx:id=\"txtWestWinner\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert tableWest != null : "fx:id=\"tableWest\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert columnPlayerWest != null : "fx:id=\"columnPlayerWest\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert columnPointsWest != null : "fx:id=\"columnPointsWest\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert columnAssistsWest != null : "fx:id=\"columnAssistsWest\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert columnStopWest != null : "fx:id=\"columnStopWest\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        //assert txtAreaPlayerStatsW != null : "fx:id=\"txtAreaPlayerStatsW\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert txtEastWinner != null : "fx:id=\"txtEastWinner\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert tableEast != null : "fx:id=\"tableEast\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert columnPlayerEast != null : "fx:id=\"columnPlayerEast\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert columnPointsEast != null : "fx:id=\"columnPointsEast\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert columnAssistsEast != null : "fx:id=\"columnAssistsEast\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert columnStopEast != null : "fx:id=\"columnStopEast\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        //assert txtAreaPlayerStatsE != null : "fx:id=\"txtAreaPlayerStatsE\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert txtChamp != null : "fx:id=\"txtChamp\" was not injected: check your FXML file 'GoToFinals.fxml'.";
        assert txtAreaResults != null : "fx:id=\"txtAreaResults\" was not injected: check your FXML file 'GoToFinals.fxml'.";

    }
    
    public void setModel(Model model, Stage stage) {
		this.model = model;
		this.stage = stage;
		txtEastWinner.appendText(model.getEastWinner().getName());
		txtWestWinner.appendText(model.getWestWinner().getName());
	}
}
