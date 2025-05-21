package com.luccaltr.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luccaltr.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
