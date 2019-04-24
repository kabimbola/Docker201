package com.mindtree.service;

import java.util.List;

import com.mindtree.dao.playerdao.PlayerDao;
import com.mindtree.dao.playerdao.PlayerDaoImpl;
import com.mindtree.dao.teamdao.TeamDao;
import com.mindtree.dao.teamdao.TeamDaoImpl;
import com.mindtree.model.Player;
import com.mindtree.model.Team;

public class ServiceImpl implements Service{

	PlayerDao pDaoObj = new PlayerDaoImpl();
	TeamDao tDaoObj = new TeamDaoImpl();
	
	@Override
	public String addTeam(Team team) {
		return tDaoObj.addTeam(team);
	}

	@Override
	public List<Team> getAllTeams() {
		return tDaoObj.getAllTeams();
	}

	@Override
	public String addPlayer(Player player) {
		return pDaoObj.addPlayer(player);
	}

	@Override
	public List<Player> getAllPlayers() {
		return pDaoObj.getAllPlayers();
	}

	@Override
	public Player getPlayerById(String id) {
		return pDaoObj.getPlayerById(id);
	}

	@Override
	public List<Player> getPlayerByStatus(String status) {
		return pDaoObj.getPlayerByStatus(status);
	}

}
