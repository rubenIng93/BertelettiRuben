package it.polito.tdp.simulatoreNBA.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import it.polito.tdp.simulatoreNBA.model.IdTeam;
import it.polito.tdp.simulatoreNBA.model.Player;

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
	
	public List<Player> getPlayerByTeam(String team){
		
		
		String sql = "SELECT * " + 
				"from player_stats p " + 
				"WHERE p.Team = ?";
		
		List<Player> teamsPlayers = new ArrayList<>();
		
		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, team);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				Player p = new Player(rs.getString("name"),
						team,
						rs.getInt("age"), 
						rs.getDouble("points"),
						rs.getDouble("blocks"),
						rs.getDouble("steals"),
						rs.getDouble("assists"),
						rs.getDouble("rebounds"),
						rs.getDouble("ft"),
						rs.getDouble("fta"),
						rs.getDouble("fg3"),
						rs.getDouble("fg3a"),
						rs.getDouble("fg"),
						rs.getDouble("fga"),
						rs.getDouble("mp"));
				teamsPlayers.add(p);
			}

			st.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore di connessione al Database.");
		}

		return teamsPlayers;
	}

}
