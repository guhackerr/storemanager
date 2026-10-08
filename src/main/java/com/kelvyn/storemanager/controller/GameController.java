package com.kelvyn.storemanager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kelvyn.storemanager.gameservice.GameService;
import com.kelvyn.storemanager.model.Game;

@RestController 
@RequestMapping("/books")
public class GameController {
    
    private final GameService gameservice;

    public GameController(GameService gameService){
        this.gameservice = gameService;
    }


    @GetMapping 
    public List<Game> listar(){
        return gameService.listarGames();
    }

    @GetMapping("/{id}")
    public Optional<Game> buscarPorId(@PathVariable String id){
        return gameService.gameSelect(id);
    }

    @PostMapping
    public Game salvar(@RequestBody Game game){
        return gameService.gameSave(game);
    }

    @DeleteMapping("/{id}")
    public void alterar(@PathVariable String id){
        gameService.deletar(id);
    }
}
