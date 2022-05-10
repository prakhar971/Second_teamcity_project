package com.teamCity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teamCity.entity.Teamcity;
import com.teamCity.service.TeamcityService;

@Controller
public class TeamcityController {
	
	@Autowired
	private TeamcityService teamcityService;

	@RequestMapping("/showsaveTeamcity")
	public String saveTeamcityPage() {
			
		return "saveTeamcity";	
	}
	
	@RequestMapping("/saveTeamcityData")
	public String saveTeamcityData(@ModelAttribute("Teamcity") Teamcity teamcity,Model model) {
		teamcityService.saveTeamcityInfo(teamcity);		
		model.addAttribute("teamcity", teamcity);
		return "second";
				
				
	}
}
