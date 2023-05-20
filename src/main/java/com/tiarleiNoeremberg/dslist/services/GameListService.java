package com.tiarleiNoeremberg.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.tiarleiNoeremberg.dslist.dto.GameListDTO;
import com.tiarleiNoeremberg.dslist.entities.GameList;
import com.tiarleiNoeremberg.dslist.projections.GameMinProjection;
import com.tiarleiNoeremberg.dslist.repositories.GameListRepository;
import com.tiarleiNoeremberg.dslist.repositories.GameRepository;

@Component	//opcional apelido @Service
public class GameListService {
	 
	@Autowired
	private GameListRepository gameListRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		//opcionalmente podemos resumir o comando do return
		//List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		//return dto;
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
	@Transactional
	public void move(Long ListId, int sourceIndex, int destinationIndex) {
		List<GameMinProjection> list = gameRepository.searchByList(ListId);
		GameMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		
		for(int i = min; i <= max; i++) {
			gameListRepository.updateBelongingPosition(ListId, list.get(i).getId(), i);
		}
	}
}  
