package com.mindtree.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Team {
	@Id
	private int id;
	private String name;
	@OneToMany(targetEntity = Player.class)
	private List<Player> players;
	private String state;
	
	public Team() {
		super();
	}

	public Team(int id, String name, List<Player> players, String state) {
		super();
		this.id = id;
		this.name = name;
		this.players = players;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", players=" + players + ", state=" + state + "]";
	}
	
	
	
	

}
