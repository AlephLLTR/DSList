package com.luccaltr.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luccaltr.dslist.dto.GameMinDTO;
import com.luccaltr.dslist.entities.Game;
import com.luccaltr.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto_result = result.stream().map(game -> new GameMinDTO(game)).toList();
        return dto_result;
    }

}
