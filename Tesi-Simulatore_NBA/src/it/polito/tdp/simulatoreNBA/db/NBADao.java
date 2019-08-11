package it.polito.tdp.simulatoreNBA.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import it.polito.tdp.simulatoreNBA.model.IdTeam;

public class NBADao {
	
	public List<IdTeam> getEastTeams(){
		
		String sql = "SELECT * " + 
				"FROM teams t " + 
				"WHERE t.conference = 'east'";
		
		List<IdTeam> result = new ArrayList<IdTeam>();
		

		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				IdTeam team = new IdTeam(rs.getString("abbreviation"), rs.getString("name"), "east");
				result.add(team);
			}

			st.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore di connessione al Database.");
		}

		return result;
		
	}
	
	public List<IdTeam> getWestTeams(){
		
		String sql = "SELECT * " + 
				"FROM teams t " + 
				"WHERE t.conference = 'west'";	
		
		List<IdTeam> result = new ArrayList<IdTeam>();
		

		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				IdTeam team = new IdTeam(rs.getString("abbreviation"), rs.getString("name"), "west");
				result.add(team);
			}

			st.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore di connessione al Database.");
		}

		return result;
		
		
	}

}
