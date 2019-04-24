package com.mindtree.dao.teamdao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mindtree.model.Player;
import com.mindtree.model.Team;
import com.mindtree.utils.MccUtils;

public class TeamDaoImpl implements TeamDao{
	public String addTeam(Team team) {
		Session session = MccUtils.createConnection();
		Transaction txn = session.beginTransaction(); 
		session.save(team);
		txn.commit();
		return "Success";
	}

	public List<Team> getAllTeams() {
		List<Team> teams = new ArrayList<>();
		Session session = MccUtils.createConnection();
		Transaction txn = session.beginTransaction(); 
		Query query = session.createQuery("from Team");
		teams = query.getResultList();
		return teams;
	}
}
