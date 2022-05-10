package com.teamCity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamCity.entity.Teamcity;

public interface TeamcityRepository extends JpaRepository<Teamcity , Long> {

}
