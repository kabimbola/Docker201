package com.mindtree.service;

import java.util.List;

import com.mindtree.model.Player;
import com.mindtree.model.Team;

public interface Service {
	public String addTeam(Team team);
	public List<Team> getAllTeams();
	
	public String addPlayer(Player player);
	public List<Player> getAllPlayers();
	public Player getPlayerById(String id);
	public List<Player> getPlayerByStatus(String status);
}
