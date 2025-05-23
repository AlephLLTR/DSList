package com.luccaltr.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luccaltr.dslist.dto.GameDTO;
import com.luccaltr.dslist.dto.GameMinDTO;
import com.luccaltr.dslist.entities.Game;
import com.luccaltr.dslist.projections.GameMinProjection;
import com.luccaltr.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long gameId) {
        Game result = gameRepository.findById(gameId).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(object -> new GameMinDTO(object)).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(object -> new GameMinDTO(object)).toList();
    }

}
