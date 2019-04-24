package com.mindtree.dao.teamdao;

import java.util.List;

import com.mindtree.model.Team;

public interface TeamDao {
	public String addTeam(Team team);
	public List<Team> getAllTeams();

}
