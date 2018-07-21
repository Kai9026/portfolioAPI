package com.portfolio.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.api.models.Tech;
import com.portfolio.api.services.ITechService;

@RestController
@RequestMapping("/techs")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class TechController {
	
	@Autowired
	private ITechService techService;

	@GetMapping
	public List<Tech> findAll() {
		return techService.findAll();
	}
	
	
	
}
