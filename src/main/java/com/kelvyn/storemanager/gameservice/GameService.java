
package com.kelvyn.storemanager.gameservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelvyn.storemanager.model.Game;
import com.kelvyn.storemanager.repository.GameRepository;

@Service 
public class GameService {

    @Autowired 
    private GameRepository gameRepository;

    public List<Game> listarGames(){
        return gameRepository.findAll();
    }

    public Optional<Game> gameSelect(String id){
        return gameRepository.findById(id);
    }

    public Game gameSave(Game game){
        return gameRepository.save(game);
    }

    public void deletar(String id){
        gameRepository.deleteById(id);
    }
}
