package com.gamebooth.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamebooth.admin.entity.GameBoothEntity;
import com.gamebooth.admin.repository.GameBoothRepository;

@Service
public class GameBoothService {

	@Autowired
	private GameBoothRepository gameBoothRepository;

	public List<GameBoothEntity> getBoothEntities() {
		return gameBoothRepository.findAll();
	}

	public GameBoothEntity addBoothEntity(GameBoothEntity gameBoothEntity) {
		return gameBoothRepository.save(gameBoothEntity);
	}
}
