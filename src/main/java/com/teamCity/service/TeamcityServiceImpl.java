package com.teamCity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamCity.entity.Teamcity;
import com.teamCity.repository.TeamcityRepository;

@Service
public class TeamcityServiceImpl implements TeamcityService {

	@Autowired
private TeamcityRepository teamcityRepo;

	 
	@Override
	public void saveTeamcityInfo(Teamcity teamcity) {
	
		teamcityRepo.save(teamcity);

	}

}
