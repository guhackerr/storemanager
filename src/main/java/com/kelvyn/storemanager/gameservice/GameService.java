
package com.kelvyn.storemanager.gameservice;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kelvyn.storemanager.model.Game;
import com.kelvyn.storemanager.repository.GameRepository;

@Service 
public class GameService {
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {

        this.gameRepository = gameRepository;
    }

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
