package com.tiarleiNoeremberg.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiarleiNoeremberg.dslist.dto.GameListDTO;
import com.tiarleiNoeremberg.dslist.dto.GameMinDTO;
import com.tiarleiNoeremberg.dslist.dto.ReplacementDTO;
import com.tiarleiNoeremberg.dslist.services.GameListService;
import com.tiarleiNoeremberg.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController { 
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{ListId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long ListId){
		List<GameMinDTO> result = gameService.findByList(ListId);
		return result;
	}
	
	@PostMapping(value = "/{ListId}/replacement")
	public void move(@PathVariable Long ListId, @RequestBody ReplacementDTO body){
		gameListService.move(ListId, body.getSourceIndex(), body.getDestinatioIndex());
	}
}
