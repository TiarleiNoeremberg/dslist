package com.tiarleiNoeremberg.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiarleiNoeremberg.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
