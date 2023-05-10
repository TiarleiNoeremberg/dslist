package com.tiarleiNoeremberg.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.tiarleiNoeremberg.dslist.dto.GameDTO;
import com.tiarleiNoeremberg.dslist.dto.GameMinDTO;
import com.tiarleiNoeremberg.dslist.entities.Game;
import com.tiarleiNoeremberg.dslist.projections.GameMinProjection;
import com.tiarleiNoeremberg.dslist.repositories.GameRepository;

@Component	//opcional apelido @Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		//opcionalmente podemos resumir o comando do return
		//GameDTO dto = new GameDTO(result);
		//return dto;
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		//opcionalmente podemos resumir o comando do return
		//List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		//return dto;
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long ListId){
		List<GameMinProjection> result = gameRepository.searchByList(ListId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
