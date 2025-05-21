package com.luccaltr.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luccaltr.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
