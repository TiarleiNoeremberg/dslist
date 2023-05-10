package com.tiarleiNoeremberg.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.tiarleiNoeremberg.dslist.dto.GameListDTO;
import com.tiarleiNoeremberg.dslist.entities.GameList;
import com.tiarleiNoeremberg.dslist.repositories.GameListRepository;

@Component	//opcional apelido @Service
public class GameListService {
	 
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		//opcionalmente podemos resumir o comando do return
		//List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		//return dto;
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
