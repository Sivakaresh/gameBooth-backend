package com.gamebooth.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamebooth.admin.entity.GameBoothEntity;

public interface GameBoothRepository extends JpaRepository<GameBoothEntity, Integer> {

}
