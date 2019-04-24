package com.mindtree.dao.playerdao;

import java.util.List;

import com.mindtree.model.Player;

public interface PlayerDao {
	public String addPlayer(Player player);
	public List<Player> getAllPlayers();
	public Player getPlayerById(String id);
	public List<Player> getPlayerByStatus(String status);
	
}
