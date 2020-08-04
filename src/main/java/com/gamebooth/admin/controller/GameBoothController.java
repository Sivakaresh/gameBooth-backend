package com.gamebooth.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gamebooth.admin.entity.GameBoothEntity;
import com.gamebooth.admin.service.GameBoothService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class GameBoothController {
	@Autowired
	private GameBoothService gameBoothService;

	@GetMapping("/view")
	public List<GameBoothEntity> viewAll() {
		return gameBoothService.getBoothEntities();
	}

	@PostMapping("/add")
	public GameBoothEntity add(@RequestBody GameBoothEntity gameBoothEntity) {
		return gameBoothService.addBoothEntity(gameBoothEntity);
	}

	@GetMapping("/view/{id}")
	public GameBoothEntity viewById(@PathVariable int id) {
		return gameBoothService.getBoothEntity(id);
	}

}
