package com.kelvyn.storemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kelvyn.storemanager.model.Game;

public interface GameRepository extends JpaRepository<Game, String>{
    
}
