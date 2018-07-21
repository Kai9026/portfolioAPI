package com.portfolio.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.api.models.Tech;
import com.portfolio.api.repositories.TechRepository;

@Service
public class TechServiceImpl implements ITechService{
	
	@Autowired
	private TechRepository techRepository;

	@Override
	public List<Tech> findAll() {
		return techRepository.findAll();
	}

}
