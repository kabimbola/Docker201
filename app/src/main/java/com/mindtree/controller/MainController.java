package com.mindtree.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.dao.playerdao.PlayerDaoImpl;
import com.mindtree.dao.teamdao.TeamDaoImpl;
import com.mindtree.model.Player;
import com.mindtree.model.Team;
import com.mindtree.service.Service;
import com.mindtree.service.ServiceImpl;

@Controller
public class MainController {
	
	PlayerDaoImpl playerDaoObj = new PlayerDaoImpl();
	TeamDaoImpl teamDaoObj = new TeamDaoImpl();
	Service servObj = new ServiceImpl();
	
	
	
	
	//---------------------------------- GOING TO INDEX ----------------------------------
	@RequestMapping(value = "/index")
	public ModelAndView indexPage()
	{
		return new ModelAndView("index");
	}
	
	//---------------------------------- GOING TO ADD PLAYER ----------------------------------
	@RequestMapping(value = "/addPlayer")
	public ModelAndView toAddPlayer(HttpServletRequest request, HttpServletResponse response)
	{
		return new ModelAndView("addplayer");
	}
	
	//---------------------------------- ADDING PLAYER ----------------------------------
	@RequestMapping(value ="addPlayer", method = RequestMethod.POST)
	public ModelAndView addPlayer(HttpServletRequest request, HttpServletResponse response)
	{
		Player player = new Player();
		player.setId(request.getParameter("id"));
		player.setName(request.getParameter("name"));
		player.setType(request.getParameter("type"));
		player.setAge(Integer.parseInt(request.getParameter("age")));
		player.setStatus("available");
		player.setBattingAvg(Double.parseDouble(request.getParameter("batAvg")));
		player.setBowlingAvg(Double.parseDouble(request.getParameter("bowlAvg")));	
		
		String message = servObj.addPlayer(player);
		return displayPlayers(request, response);
	}
	
	//---------------------------------- DISPLAYING PLAYERS ----------------------------------
	@RequestMapping(value="/getAllPlayers", method=RequestMethod.GET)
	public ModelAndView displayPlayers(HttpServletRequest request, HttpServletResponse response)
	{
		List<Player> plist= new ArrayList<>();
		plist = servObj.getAllPlayers();
		
		return new ModelAndView("showplayers","list", plist);	
	}
	
	
	//---------------------------------- ADDING TEAM ----------------------------------
	@RequestMapping(value = "/addTeam")
	public ModelAndView toAddTeam()
	{
		List<Player> plist= new ArrayList<>();
		
		plist = servObj.getAllPlayers().stream().filter
		(p->p.getStatus().equalsIgnoreCase("available")).collect(Collectors.toList());
		
		System.out.println(plist);
		
		return new ModelAndView("addteam","list",plist);
	}
	
	
	//---------------------------------- ADDING TEAM ----------------------------------
	@RequestMapping(value ="addTeam", method = RequestMethod.POST)
	public ModelAndView addTeam(HttpServletRequest request, HttpServletResponse response)
	{
		List<Player> teamplayers = new ArrayList<>();
		Player player;
		
		String[] players = request.getParameterValues("teamPlayers");
		for (int i = 0; i < players.length; i++) {
			player = servObj.getPlayerById(players[i]);
			player.setStatus("Booked");
			teamplayers.add(player);
			servObj.addPlayer(player);	
		}
		
		Team team = new Team();
		team.setId(Integer.parseInt(request.getParameter("id")));
		team.setPlayers(teamplayers);
		team.setName(request.getParameter("name"));
		team.setState(request.getParameter("state"));
		
		String msg = servObj.addTeam(team);
		
		List<Team> teams = new ArrayList<>();
		teams = servObj.getAllTeams();
		
		return new ModelAndView("showteams","list",teams);
	}
}
