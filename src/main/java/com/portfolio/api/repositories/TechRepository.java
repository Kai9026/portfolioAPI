package com.portfolio.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.api.models.Tech;

public interface TechRepository extends JpaRepository<Tech, Integer>{
	
	public List<Tech> findAll();

}
