package com.tiarleiNoeremberg.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tiarleiNoeremberg.dslist.entities.Game;
import com.tiarleiNoeremberg.dslist.entities.GameMinDTO;
import com.tiarleiNoeremberg.dslist.repositories.GameRepository;

@Component	//opcional apelido @Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		//opcionalmente podemos resumir o comando do return
		//List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		//return dto;
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
