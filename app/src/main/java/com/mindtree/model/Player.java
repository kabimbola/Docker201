package com.mindtree.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	private String id;
	private String name;
	private String type;
	private int age;
	private double battingAvg;
	private double bowlingAvg;
	private String status;
	
	public Player() {
		super();
	}
	
	public Player(String id, String name, String type, int age, double battingAvg, double bowlingAvg, String status) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.age = age;
		this.battingAvg = battingAvg;
		this.bowlingAvg = bowlingAvg;
		this.status = status;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBattingAvg() {
		return battingAvg;
	}
	public void setBattingAvg(double battingAvg) {
		this.battingAvg = battingAvg;
	}
	public double getBowlingAvg() {
		return bowlingAvg;
	}
	public void setBowlingAvg(double bowlingAvg) {
		this.bowlingAvg = bowlingAvg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", type=" + type + ", age=" + age + ", battingAvg=" + battingAvg
				+ ", bowlingAvg=" + bowlingAvg + ", status=" + status + "]";
	}
}
